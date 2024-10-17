package com.teamInfinity.Ecommerce.controller;

import com.teamInfinity.Ecommerce.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
   @GetMapping
   public ApiResponse HomeControllerHandler(){
       ApiResponse apiResponse=new ApiResponse();
       apiResponse.setMessage("Welcome to ecommerce multivendor System");
        return apiResponse;
    }
}
