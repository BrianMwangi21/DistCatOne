package com.kabiru.alpha.rest;

import com.kabiru.alpha.feign.StudentFeign;
import com.kabiru.alpha.models.BlindDate;
import com.kabiru.alpha.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRest implements CommandLineRunner {

    private final StudentFeign studentFeign;

    public SampleRest(StudentFeign studentFeign) {
        // Empty constructor
        this.studentFeign = studentFeign;
    }

    @Override
    public void run(String... args) throws Exception {

        // 1. Create student
        Student new_student = studentFeign.createStudent( new Student( "94227" , "Kabiru" ) );
        System.out.println( new_student );

        // Student ID given : 40

        // 2. Request for a blind date match
        BlindDate new_blind_date = studentFeign.createBlindDateMatch("MALE", 40);
        System.out.println( new_blind_date );
    }
}
