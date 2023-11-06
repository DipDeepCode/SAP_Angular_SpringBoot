package ru.ddc.simplebackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.ddc.simplebackend.dto.DataResult;
import ru.ddc.simplebackend.dto.UserData;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/data")
    public ResponseEntity<DataResult> user(@RequestBody UserData userdata) {
        return ResponseEntity.ok(new DataResult(String.valueOf(userdata.getName().hashCode())));
    }
}
