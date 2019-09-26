package com.kabiru.alpha.rest;

import com.kabiru.alpha.feign.SampleFeign;
import com.kabiru.alpha.feign.StudentFeign;
import com.kabiru.alpha.models.SampleClass;
import com.kabiru.alpha.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
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

        // 1. Create sample
        Student new_student = studentFeign.createStudent( new Student( "94227" , "Kabiru" ) );
        System.out.println( new_student );

        // 2. Patch
        //sampleClass.setUsername("mwangi");
        //SampleClass update_sample = sampleFeign.updateSample( sampleClass.getId(), sampleClass );
        //System.out.println( update_sample );
    }
}
