package com.example.binarytodecimal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {



    @GetMapping("/convert")
    public String convert(@RequestParam String userInput){



        try{
            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) != '0' && userInput.charAt(i) != '1'){
                    throw new Exception();
                }
            }
            return "Output: "+Integer.parseInt(userInput,2);

        }
        catch(Exception e){
           return "The typed binary wasn't only made of 1's and 0's";
        }
    }
}
