package com.example.crud.repository;

import com.example.crud.entity.Study_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRecordRepository extends JpaRepository<Study_record, Integer>{

}
