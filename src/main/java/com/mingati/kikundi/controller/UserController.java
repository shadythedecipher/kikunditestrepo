package com.mingati.kikundi.controller;

import com.mingati.kikundi.dto.UserDto;
import com.mingati.kikundi.response.ApiResponse;
import com.mingati.kikundi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    public final UserService service;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public ApiResponse<UserDto> createCustomer(@Valid @RequestBody UserDto userdto) {
        return Optional.of(userdto)
                .map(service::createCustomer)
                .map(resp -> ApiResponse.<UserDto>builder()
                        .responseObject(resp)
                        .hasError(false)
                        .successMessage("created successfully with id %d ")
                        .build()).get();
    }
    @GetMapping("/greetings")
    public ResponseEntity<String> greetings(){

        return ResponseEntity.ok().body("hi there welcome to kikundi");
    }

}
