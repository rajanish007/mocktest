package com.project.mocktest.service.mapper;

import com.project.mocktest.domain.Student;
import com.project.mocktest.repository.StudentEntity;
import com.project.mocktest.utils.Utilities;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public Student convert(StudentEntity sEntity) {
        Student s = new Student();
        s.setStudentEmail(sEntity.getStudentEmail());
        s.setStudentId(sEntity.getStudentId());
        s.setStudentName(sEntity.getStudentName());
        s.setStudentPassword(Utilities.Base64decode(sEntity.getStudentPassword()));
        s.setStudentUserName(sEntity.getStudentUserName());
        return s;
    }

    public StudentEntity convert(Student s) {
        return new StudentEntity(s.getStudentName(),
                Utilities.Bas64encode(s.getStudentPassword()),
                s.getStudentUserName(),
                s.getStudentEmail());
    }

}
