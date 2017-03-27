//package com.itis.spring.servlet;
//
//import com.itis.spring.service.DoctorService;
//import org.springframework.context.ApplicationContext;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
///**
// * Created by Daria Popova on 21.03.17.
// */
//@WebServlet(value = "/servlet")
//public class DoctorServlet extends HttpServlet{
//
//    private DoctorService service;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        ApplicationContext context = (ApplicationContext)config.getServletContext().getAttribute("springContext");
//        service = context.getBean(DoctorService.class);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter writer = resp.getWriter();
//
//        service.findAll().forEach(doctor -> writer.println(doctor));
//    }
//}