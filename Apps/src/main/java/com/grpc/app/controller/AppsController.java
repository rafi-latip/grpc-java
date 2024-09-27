package com.grpc.app.controller;

import com.grpc.app.service.AppService;
import com.grpc.app.service.ResponeService;
import com.grpc.app.utils.requestDto.authRequestDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Slf4j
@RestController
@RequestMapping("app")
//@AllArgsConstructor
@RequiredArgsConstructor
public class AppsController {
    private final AppService appService;
    @PostMapping("sign-in")
    public ResponseEntity signInController(@RequestBody authRequestDto authRequest){
        return appService.signInService(authRequest);
    }


    @GetMapping("info")
    public ResponseEntity InfoController(){
        return ResponseEntity.ok("sadas");
    }
}
