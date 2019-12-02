package com.hongjun423.springinit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/errorTest")
    public String test() {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
    @ResponseBody
    public AppError responseError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReson("IDK IDK IDK");

        return appError;
    }
}
