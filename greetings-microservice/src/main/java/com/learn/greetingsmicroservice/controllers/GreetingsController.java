package com.learn.greetingsmicroservice.controllers;

import com.learn.greetingsmicroservice.dtos.GreetingsResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greetings")
public class GreetingsController {

    @GetMapping("")
    public ResponseEntity<GreetingsResponseDto> welcome(){

        GreetingsResponseDto greetingsResponseDto = new GreetingsResponseDto();
        greetingsResponseDto.setMessage("Welcome to the Spring Boot world of Azure Containers!");

        ResponseEntity<GreetingsResponseDto> responseEntity = new ResponseEntity<>(greetingsResponseDto, HttpStatus.OK);
        return responseEntity;
    }
}
