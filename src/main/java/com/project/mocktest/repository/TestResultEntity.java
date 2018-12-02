package com.project.mocktest.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "m_test_result_desc")
public class TestResultEntity {

    @NotNull
    @EmbeddedId
    private TestResultEntityId id;

    @NotNull
    @Column(name = "ans_recieved")
    private String answerRecieved;

    @Autowired
    public TestResultEntity( @NotNull TestResultEntityId id,
                            @NotNull String answerRecieved) {
        this.id = id;
        this.answerRecieved = answerRecieved;
    }

    public TestResultEntityId getId() {
        return id;
    }

    public String getAnswerRecieved() {
        return answerRecieved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResultEntity that = (TestResultEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(answerRecieved, that.answerRecieved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, answerRecieved);
    }

    @Override
    public String toString() {
        return "TestResultEntity{" +
                "id=" + id +
                ", answerRecieved='" + answerRecieved + '\'' +
                '}';
    }
}
