package com.kunal.firstjobapp.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();


    void createJob(Job job);

    Job geJobById(Long id);
}