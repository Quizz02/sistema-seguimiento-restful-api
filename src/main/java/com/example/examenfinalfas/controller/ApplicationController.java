package com.example.examenfinalfas.controller;

import com.example.examenfinalfas.entity.ApplicationEntity;
import com.example.examenfinalfas.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationRepository applicationRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ApplicationEntity add(@RequestBody ApplicationEntity application) {
        return applicationRepository.save(application);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ApplicationEntity> getAllApplications() {
        return applicationRepository.findAll();
    }
}
