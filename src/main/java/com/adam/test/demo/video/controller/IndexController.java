package com.adam.test.demo.video.controller;

import com.adam.test.demo.video.handler.MyResourceHttpRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Adam.Zhang on 2017/9/20.
 */
@Controller
public class IndexController {

    @Autowired
    private MyResourceHttpRequestHandler handler;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/video")
    public void video(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        handler.handleRequest(request, response);
    }
}
