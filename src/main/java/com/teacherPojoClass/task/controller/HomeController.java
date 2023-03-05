package com.teacherPojoClass.task.controller;

import com.teacherPojoClass.task.beans.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "index.html";
    }

    @GetMapping("/teacherForm")
    public String teacherForm(){
        return "teacherForm.html";
    }

    @PostMapping("teacherPost")
    public String studentPost(@RequestParam String adi,
                              @RequestParam String soyadi,
                              @RequestParam String bransi,
                              @RequestParam String tecrube){
        Teacher teacher1 = new Teacher();

        teacher1.setAdi(adi);
        teacher1.setSoyadi(soyadi);
        teacher1.setBransi(bransi);
        teacher1.setTecrube(tecrube);

        System.out.println(teacher1);

        return "teacherForm.html";
    }
}
