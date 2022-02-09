package me.doyoung.gof.adapter._03_java;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterSpring {
    public static void main(String[] args) {
        final DispatcherServlet dispatcherServlet = new DispatcherServlet();
        final RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
    }
}
