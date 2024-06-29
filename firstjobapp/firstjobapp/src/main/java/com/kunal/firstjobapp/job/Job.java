package com.kunal.firstjobapp.job;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@AllArgsConstructor
@Getter
@Setter
public class Job {

    private Long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
}
