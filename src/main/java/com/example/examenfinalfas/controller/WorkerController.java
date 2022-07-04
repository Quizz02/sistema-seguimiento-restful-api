package com.example.examenfinalfas.controller;

import com.example.examenfinalfas.entity.WorkerEntity;
import com.example.examenfinalfas.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {
    @Autowired
    private WorkerRepository workerRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public WorkerEntity add(@RequestBody WorkerEntity worker) {
        return workerRepository.save(worker);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<WorkerEntity> getAllWorkers() {
        return workerRepository.findAll();
    }
}
