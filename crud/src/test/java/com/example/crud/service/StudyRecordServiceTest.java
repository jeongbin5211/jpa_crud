package com.example.crud.service;

import com.example.crud.entity.Study_record;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudyRecordServiceTest {

    @Autowired
    StudyRecordService studyRecordService;

    @Test
    void setInsert() {
        Study_record study_record = Study_record.builder()
                .study_day("2024.01.01")
                .contents("Test Insert")
                .reg_day(LocalDateTime.now())
                .build();

        studyRecordService.setInsert(study_record);

    }

    @Test
    void setUpdate() {
        /*
        Study_record study_record = new Study_record();
        study_record.setKey_id(3);
        study_record.setStudy_day("2024.01.03");
        study_record.setContents("Test Insert 수정");
        study_record.setReg_day(LocalDateTime.now());
        */
        Study_record study_record = studyRecordService.getSelectOne(3);
        study_record.setContents("Test Insert 수정2");

        studyRecordService.setUpdate(study_record);
    }

    @Test
    // @Transactional == 롤백처리
    @Transactional
    void getDelete() {
        studyRecordService.getDelete(3);
    }
}