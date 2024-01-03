package com.example.crud.repository;

import com.example.crud.entity.Study_member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyMemberRepository extends JpaRepository<Study_member, Integer> {
}
