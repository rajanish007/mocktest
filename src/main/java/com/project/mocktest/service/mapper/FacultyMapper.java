package com.project.mocktest.service.mapper;

import com.project.mocktest.domain.Faculty;
import com.project.mocktest.domain.FacultyVO;
import com.project.mocktest.repository.FacultyEntity;
import com.project.mocktest.utils.Utilities;
import org.springframework.stereotype.Service;

@Service
public class FacultyMapper {

    public Faculty convert(FacultyEntity fEntity) {
        Faculty f = new Faculty();
        f.setFacultyEmail(fEntity.getFacultyEmail());
        f.setFacultyId(fEntity.getFacultyId());
        f.setFacultyName(fEntity.getFacultyName());
        f.setFacultyPassword(Utilities.Base64decode(fEntity.getFacultyPassword()));
        f.setFacultyUserName(fEntity.getFacultyUserName());
        return f;
    }

    public FacultyEntity convert(Faculty s) {
        return new FacultyEntity(s.getFacultyName(),
                Utilities.Bas64encode(s.getFacultyPassword()),
                s.getFacultyUserName(),
                s.getFacultyEmail());
    }

    public FacultyVO convertToVO(FacultyEntity fEntity) {
        Faculty s = convert(fEntity);
        FacultyVO fVO = new FacultyVO();
        fVO.setFacultyEmail(s.getFacultyEmail());
        fVO.setFacultyId(s.getFacultyId());
        fVO.setFacultyName(s.getFacultyName());
        fVO.setFacultyUserName(s.getFacultyUserName());
        return fVO;
    }

}
