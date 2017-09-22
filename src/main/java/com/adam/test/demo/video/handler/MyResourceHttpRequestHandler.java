package com.adam.test.demo.video.handler;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Adam.Zhang on 2017/9/20.
 */
@Component
public class MyResourceHttpRequestHandler extends ResourceHttpRequestHandler {

    @Override
    protected Resource getResource(HttpServletRequest request) throws IOException {
        return new FileSystemResource(ResourceUtils.getFile("classpath:static/videos/oceans.mp4"));
    }

}
