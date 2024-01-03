package com.example.crud.service;

import com.example.crud.entity.Study_member;
import com.example.crud.repository.StudyMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyMemberService {

    @Autowired
    StudyMemberRepository studyMemberRepository;

    /* 전체 Row Select */
    public List<Study_member> getSelectAll() {
        return studyMemberRepository.findAll();
    }

    /* One row Select */
    public Study_member getSelectOne(int key_id) {
        return studyMemberRepository.findById(key_id).get();
    }

    /* Insert */
    public void setInsert(Study_member study_member) {
        studyMemberRepository.save(study_member);
    }

    /* Update */
    public void setUpdate(Study_member study_member) {
        studyMemberRepository.save(study_member);
    }

    /* Delete */
    public void getDelete(int key_id) {
        studyMemberRepository.deleteById(key_id);
    }
}
