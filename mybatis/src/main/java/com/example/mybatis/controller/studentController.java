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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class studentController {
    @Resource(name = "studentServiceImpl")
    private com.example.mybatis.service.studentService  studentService;
    @RequestMapping(value = "/student/showAllHomework", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getAllHomework(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<s_homework> list = studentService.getAllHomework();
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }


    @RequestMapping(value = {"/list"})
    public  String userList(Model model){
        model.addAttribute ("homework",studentService.getAllHomework ());
        return "list";
    }

    @RequestMapping(value = {"/listForStu"})
    public  String listForStu(Model model){
        model.addAttribute ("homework",studentService.getAllHomework ());
        return "listForStu";
    }

    @RequestMapping(value = {"/studentLogin"})
    public  String studentLogin(ModelMap map){
        map.addAttribute("student",new s_student());


        return "StudentLogin";
    }

    @RequestMapping(value = "/student/Login", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String submitHomework(@ModelAttribute s_student student) throws ParseException {
        int flag = studentService.studentLogIn(student);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
            return "StudentLogin";
        }else{
            list.add("success");
            return "StudentOperation";
        }

    }

    @RequestMapping(value = {"/studentOperation"})
    public  String studentOperation(){
        return "StudentOperation";
    }



    @RequestMapping("/submit")
    public String addUser(ModelMap map){
        map.addAttribute("sh",new s_student_homework());
        return "submitHomework";
    }



    @RequestMapping(value = "/student/selectHomework", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String selectHomework(HttpServletRequest request, @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<s_homework> list = studentService.selectHomework(jsonObject);
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));

    }

//    @RequestMapping(value = "/student/submitHomework", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
//    public String submitHomework(HttpServletRequest request, @RequestBody String json) throws ParseException {
//        JSONObject jsonObject = JSONObject.parseObject(json);
//        int flag = studentService.submitHomework(jsonObject);
//        List<String> list = new ArrayList<>();
//        if(flag == 0 ){
//            list.add("false");
//        }else{
//            list.add("success")        ;
//        }
//        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
//
//    }

    @RequestMapping(value = "/student/submitHomework", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String submitHomework(@ModelAttribute s_student_homework student_homework) throws ParseException {
        int flag = studentService.insertStudentHomework(student_homework);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success");
        }
        return "shlist";
    }

    //只看相应账号的提交作业信息
    @RequestMapping(value = {"/shlistForStu"})
    public String showSHList(HttpServletRequest request, Model model){

        String nInfo="00";
        Cookie[] cookies=request.getCookies();
        for(Cookie cookie: cookies)
        {
            nInfo = cookie.getValue();
        }


        model.addAttribute ("sh",studentService.reviewHomework (Long.parseLong(nInfo)));
        return "shlistForStu";
    }



    @RequestMapping(value = {"/studentRegister"})
    public  String teacherregister(ModelMap map){
        map.addAttribute("student",new s_student());
        return "studentRegister"; }

    @RequestMapping(value = "/student/register")
    public String teacherRealRegister(@ModelAttribute s_student student) throws ParseException {
        int flag = studentService.insertStudent(student);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
            return "studentRegister";
        }else{
            list.add("success");
            return "StudentOperation";
        }

    }

    @RequestMapping("/updateStuHomework")
    public String updateUser(ModelMap map){
        map.addAttribute("student_homework",new s_student_homework());
        return "updateStuHomework";
    }

//    @RequestMapping(value = "/student/updateHomework", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
//    public String updateHomework(HttpServletRequest request, @RequestBody String json) throws ParseException {
//        JSONObject jsonObject = JSONObject.parseObject(json);
//        int flag = studentService.updateHomework(jsonObject);
//        List<String> list = new ArrayList<>();
//        if(flag == 0 ){
//            list.add("false");
//        }else{
//            list.add("success")        ;
//        }
//        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
//    }

    @RequestMapping(value = "/student/saveUpdate", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String updateHomework(@ModelAttribute s_student_homework student_homework) throws ParseException {
        //student_homework.setShid(Long.parseLong("3")); //直在debug时候用到
        int flag = studentService.updateHomework(student_homework);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return "shlistForStu";
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
