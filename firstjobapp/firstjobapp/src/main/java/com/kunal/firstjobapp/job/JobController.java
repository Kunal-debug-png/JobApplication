package com.kunal.firstjobapp.job;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@RestController
public class JobController {
    private JobService jobServie;

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobServie.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        jobServie.createJob(job);
        return "Job added success";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id){
        Job job=jobServie.geJobById(id);
        return job;
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id){
        boolean deleted=jobServie.deleteJobById(id);
        if(deleted)
            return new ResponseEntity<>("job delted", HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/jobs/{id}")
    public ResponseEntity<String> updateJob(@PathVariable Long id,@RequestBody Job updatedJob){
        boolean updated=jobServie.updateJob(id,updatedJob);
        if(updated)
            return new ResponseEntity<>("Job updated",HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
