package com.example.crud.controller;

import com.example.crud.entity.Study_record;
import com.example.crud.service.StudyRecordService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/study")
public class StudyController {

    @Autowired
    StudyRecordService studyRecordService;
    @GetMapping("/list")
    public String getSelectAll(Model model) {

        List<Study_record> list = studyRecordService.getSelectAll();

        model.addAttribute("list", list);

        return "/study/study_list";
    }

    @GetMapping("/insert")
    public String getInsert() {
        return "/study/study_ins";
    }

    @PostMapping("/insert")
    public String setInsert(@ModelAttribute Study_record study_record) {

        study_record.setReg_day(LocalDateTime.now());
        studyRecordService.setInsert(study_record);

        return "redirect:/study/list";
    }

    @GetMapping("/modify")
    public String getUpdate(HttpServletRequest request, Model model) {

        String strKeyId = request.getParameter("key_id");

        Study_record study_record = studyRecordService.getSelectOne(Integer.parseInt(strKeyId));

        model.addAttribute("study", study_record);
        // request.setAttribute("study", study_record);

        return "/study/study_mod";
    }

    @PostMapping("/modify")
    public String setUpdate(@ModelAttribute Study_record study_record) {

        // study_record.setMod_day(LocalDateTime.now());
        studyRecordService.setUpdate(study_record);

        return "redirect:/study/list";
    }

    @GetMapping("/delete")
    public String getDelete(@RequestParam int key_id) {

        studyRecordService.getDelete(key_id);

        return "redirect:/study/list";
    }
}
