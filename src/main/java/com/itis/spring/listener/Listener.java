//package com.itis.spring.listener;
//
//import com.itis.spring.config.RootConfig;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//
///**
// * Created by Daria Popova on 21.03.17.
// */
//@WebListener
//public class Listener implements ServletContextListener {
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
//        sce.getServletContext().setAttribute("springContext", context);
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent sce) {
//
//    }
//}
