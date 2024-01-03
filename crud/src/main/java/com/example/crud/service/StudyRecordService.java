package com.example.crud.service;

import com.example.crud.entity.Study_record;
import com.example.crud.repository.StudyRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyRecordService {

    @Autowired
    StudyRecordRepository studyRecordRepository;

    /* 전체 Row Select */
    public List<Study_record> getSelectAll() {
        return studyRecordRepository.findAll();
    }

    /* One row Select */
    public Study_record getSelectOne(int key_id) {
        return studyRecordRepository.findById(key_id).get();
    }

    /* Insert */
    public void setInsert(Study_record study_record) {
        studyRecordRepository.save(study_record);
    }

    /* Update */
    public void setUpdate(Study_record study_record) {
        studyRecordRepository.save(study_record);
    }

    /* Delete */
    public void getDelete(int key_id) {
        studyRecordRepository.deleteById(key_id);
    }
}
