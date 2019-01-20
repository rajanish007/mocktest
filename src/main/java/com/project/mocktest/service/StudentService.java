package com.project.mocktest.service;

import com.project.mocktest.domain.Result;
import com.project.mocktest.domain.Student;
import com.project.mocktest.domain.StudentVO;
import com.project.mocktest.repository.StudentEntity;
import com.project.mocktest.repository.StudentRepository;
import com.project.mocktest.service.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    /**
     * CREATE STUDENT
     *
     * @param student
     */
    public void createStudent(Student student) {
        StudentEntity studentEntity = studentMapper.convert(student);
        studentRepository.save(studentEntity);
    }

    /**
     * GET STUDENT PROFILE
     *
     * @param userName
     * @return
     */
    public StudentVO getStudent(String userName) {
        StudentEntity studentEntity = studentRepository.findUserByStudentUserName(userName);
        StudentVO studentVO = studentMapper.convertToVO(studentEntity);
        return studentVO;
    }

    /**
     * FETCH STUDENT BY ID FROM RESULTS
     *
     * @param results
     * @return
     */
    public List<Student> findStudentsByIdsFromResult(List<Result> results) {
        List<Student> students = new ArrayList();
        for (Result result : results) {
            students.add(studentMapper.convert(studentRepository.findByStudentId(result.getStudentId())));
        }
        return students;
    }

}
