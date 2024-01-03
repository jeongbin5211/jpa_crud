package com.example.crud.controller;

import com.example.crud.entity.Study_member;
import com.example.crud.service.StudyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    StudyMemberService studyMemberService;

    @GetMapping("/list")
    public String getMemberList(Model model) {

        List<Study_member> list = studyMemberService.getSelectAll();

        model.addAttribute("list", list);

        return "/member/member_list";
    }

    @GetMapping("/insert")
    public String getInsertMember() {
        return "/member/member_join";
    }

    @PostMapping("/insert")
    public String setInsertMember(@ModelAttribute Study_member study_member) {

        studyMemberService.setInsert(study_member);

        return "redirect:/member/list";
    }

    @GetMapping("/delete")
    public String getDelete(@RequestParam(value = "key_id") String strMemberId) {

        studyMemberService.getDelete(Integer.parseInt(strMemberId));

        return "redirect:/member/list";
    }
}
