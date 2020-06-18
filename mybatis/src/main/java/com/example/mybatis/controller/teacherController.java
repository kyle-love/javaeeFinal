package com.example.mybatis.controller;
import com.alibaba.fastjson.JSONObject;
import com.example.mybatis.entity.*;
import com.example.mybatis.service.Impl.studentServiceImpl;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class teacherController {
    @Resource(name = "teacherServiceImpl")
    private com.example.mybatis.service.teacherService  teacherService;

//    @RequestMapping(value = "/teacher/setHomework", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
//    public String setHomework(HttpServletRequest request, @RequestBody String json) throws ParseException {
//        JSONObject jsonObject = JSONObject.parseObject(json);
//        int flag = teacherService.setHomework(jsonObject);
//        List<String> list = new ArrayList<>();
//        if(flag == 0 ){
//            list.add("false");
//        }else{
//            list.add("success")        ;
//        }
//        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
//
//    }

    @RequestMapping("/add")
    public String addHomework(ModelMap map){
        map.addAttribute("homework",new s_homework());
        return "addHomework";
    }
    @RequestMapping("/update")
    public String updateUser(ModelMap map){
        map.addAttribute("homework",new s_homework());
        return "update";
    }

    @RequestMapping(value = "/teacher/setHomework", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String setHomework(@ModelAttribute s_homework homework) throws ParseException {
        int flag = teacherService.insertHomework(homework);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return "list";

    }



    @RequestMapping(value = {"/teacherLogin"})
    public  String teacherRegister(ModelMap map){
        map.addAttribute("teacher",new s_teacher());
        return "teacherLogin"; }

    @RequestMapping(value = "/teacher/Login", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String submitHomework(@ModelAttribute s_teacher teacher) throws ParseException {
        int flag = teacherService.teacherLogin(teacher);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
            return "teacherLogin";
        }else{
            list.add("success");
            return "TeacherOperation";
        }

    }

    @RequestMapping(value = {"/teacherRegister"})
    public  String teacherregister(ModelMap map){
        map.addAttribute("teacher",new s_teacher());
        return "TeacherRegister"; }

    @RequestMapping(value = "/teacher/register")
    public String teacherRealRegister(@ModelAttribute s_teacher teacher) throws ParseException {
        int flag = teacherService.insertTeacher(teacher);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success");
        }
        return "TeacherOperation";
    }

    @RequestMapping(value = {"/teacherOperation"})
    public  String studentOperation(){
        return "TeacherOperation";
    }

    @RequestMapping(value = {"/shlist"})
    public  String userList(Model model){
        model.addAttribute ("sh",teacherService.reviewHomework ());
        return "shlist";
    }

    @RequestMapping(value = "/teacher/reviewHomework", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String reviewHomework(HttpServletRequest request, @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<s_student_homework> list = teacherService.reviewHomework();
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));

    }

    @RequestMapping(value = "/teacher/saveUpdate", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String updateHomework(@ModelAttribute s_homework homework) throws ParseException {
        int flag = teacherService.updateHomework(homework);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return "list";
    }

    public JSONObject addUrl(HttpServletRequest request, JSONObject jsonObject, List list){
        JSONObject req=new JSONObject();
        req.put("link",request.getRequestURL().toString());
        req.put("body",jsonObject);

        JSONObject listall=new JSONObject();
        listall.put("request",req);
        listall.put("data",list);
        return listall;
    }
}
