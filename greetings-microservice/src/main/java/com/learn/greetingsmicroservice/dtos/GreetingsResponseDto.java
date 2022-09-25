package com.learn.greetingsmicroservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GreetingsResponseDto {

    private boolean success = true;
    
    private String message;
}
