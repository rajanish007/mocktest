package com.project.mocktest.service.mapper;

import com.project.mocktest.domain.Student;
import com.project.mocktest.domain.StudentVO;
import com.project.mocktest.repository.StudentEntity;
import com.project.mocktest.utils.Utilities;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    /**
     * STUDENT ENTITY TO DTO MAPPER
     *
     * @param sEntity
     * @return
     */
    public Student convert(StudentEntity sEntity) {
        Student s = new Student();
        s.setStudentEmail(sEntity.getStudentEmail());
        s.setStudentId(sEntity.getStudentId());
        s.setStudentName(sEntity.getStudentName());
        s.setStudentPassword(Utilities.Base64decode(sEntity.getStudentPassword()));
        s.setStudentUserName(sEntity.getStudentUserName());
        return s;
    }

    /**
     * STUDENT DTO TO ENTITY MAPPER
     *
     * @param s
     * @return
     */
    public StudentEntity convert(Student s) {
        return new StudentEntity(s.getStudentName(),
                Utilities.Bas64encode(s.getStudentPassword()),
                s.getStudentUserName(),
                s.getStudentEmail());
    }

    /**
     * STUDENT ENTITY TO VO MAPPER
     *
     * @param sEntity
     * @return
     */
    public StudentVO convertToVO(StudentEntity sEntity) {
        Student s = convert(sEntity);
        StudentVO sVO = new StudentVO();
        sVO.setStudentEmail(s.getStudentEmail());
        sVO.setStudentId(s.getStudentId());
        sVO.setStudentName(s.getStudentName());
        sVO.setStudentUserName(s.getStudentUserName());
        return sVO;
    }


}
