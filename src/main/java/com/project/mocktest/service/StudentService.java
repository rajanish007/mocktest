package com.project.mocktest.service;

import com.project.mocktest.domain.Student;
import com.project.mocktest.domain.StudentVO;
import com.project.mocktest.repository.StudentEntity;
import com.project.mocktest.repository.StudentRepository;
import com.project.mocktest.service.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    public void createStudent(Student student) {
        StudentEntity studentEntity = studentMapper.convert(student);
        studentRepository.save(studentEntity);
    }

    public StudentVO getStudent(String userName){
        StudentEntity studentEntity = studentRepository.findUserByStudentUserName(userName);
        StudentVO studentVO = studentMapper.convertToVO(studentEntity);
        return studentVO;
    }

}
