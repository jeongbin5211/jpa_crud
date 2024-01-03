package com.example.crud.repository;

import com.example.crud.entity.Study_record;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudyRecordRepositoryTest {

    @Autowired
    StudyRecordRepository studyRecordRepository;

    @Test
    public void testSelectAll() {
        List<Study_record> list = studyRecordRepository.findAll();

        for(Study_record record : list) {
            System.out.println(record.getKey_id());
            System.out.println(record.getStudy_day());
            System.out.println(record.getContents());
            System.out.println(record.getReg_day());
        }
    }

    @Test
    public void testSelectOne() {
        Study_record record = studyRecordRepository.findById(1).get();

        System.out.println(record.getKey_id());
        System.out.println(record.getStudy_day());
        System.out.println(record.getContents());
        System.out.println(record.getReg_day());
    }
}