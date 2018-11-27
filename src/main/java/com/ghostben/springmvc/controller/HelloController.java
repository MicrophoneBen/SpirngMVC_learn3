package com.ghostben.springmvc.controller;

import com.ghostben.springmvc.controller.modelEntity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springmvc3
 * @description: Spring MVC的HelloController，测试类
 * @author: ghostben
 * @create: 2018-11-26 23:20
 **/
@RequestMapping(value = "/demo")
@Controller
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println("Hello Spring Mvc");
        return "hello";
    }

    @RequestMapping(value = "/testPsot", method = RequestMethod.POST)
    public String testPost(String username, String pass){
        System.out.println("测试SpringMVC的POST请求");
        return "user";
    }

    //使用HiddenHttpMethodFilter来构建发送DELETE请求以及PUT请求

    @ResponseBody
    @RequestMapping(value = "/testDelete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer deleteId){
        System.out.println("前台发送了一个Delete请求" + "id   :"  + deleteId);
        return "DELETE Success";
    }

    @ResponseBody
    @RequestMapping(value = "/testPut/{id}", method = RequestMethod.PUT)
    public String mofify(@PathVariable("id") Integer modifyId){
        System.out.println("前台发送了一个Delete请求" + "id   :"  + modifyId);
        return "Update Success  更新成功";
    }

    //直接映射前台的一个Class

    //@ResponseBody
    @RequestMapping(value = "/mappingClass", method = RequestMethod.POST)
    public void testMapperClass(User user, Writer out,HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.setContentType("text/json; charset=UTF-8");
        out.write(user.toString());
        out.write(user.getUsername());
        out.write(user.getLocate().toString());
    }


    /**
    *@author    : Microphoneben
    *@date      : 2018/11/27
    * SpringMVC可以使用Servlet原生的API作为参数 具体支持以下的
     * HttpServletRequest
     * HttpServletResponse
     * HttpSession
     * java.security.Principal
     * Locale
     * InputStream
     * OutputStream
     * Reader
     * Writer
    */
    @RequestMapping("/testServlet")
    public void testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer out) throws IOException {
        System.out.println("testServletAPI :" + request + " ," + response );
        response.setContentType("text/json; charset = UTF-8");
        out.write("你好");
        //return "hello";
    }
}