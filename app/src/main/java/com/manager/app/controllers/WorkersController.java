package com.manager.app.controllers;

import com.manager.app.business.abstracts.WorkerService;
import com.manager.app.entities.concrete.Worker;
import com.manager.app.entities.dto.WorkerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("worker")
public class WorkersController {

    @Autowired
    WorkerService workerService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getall")
    public List<Worker> getAllWorkers(){
        return this.workerService.getAll();
    }

    @PostMapping("/add")
    public Worker addWorker(@RequestBody WorkerDto workerDto){
        return this.workerService.workerAdd(workerDto);
    }

    @GetMapping("/{workerId}")
    public Worker getWorkerById(@PathVariable long workerId){
        return this.workerService.getWorkerById(workerId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getbymarketid/{marketId}")
    public List<Worker> getWorkerByMarketId(@PathVariable long marketId){
        return this.workerService.getWorkersByMarketId(marketId);
    }



}
