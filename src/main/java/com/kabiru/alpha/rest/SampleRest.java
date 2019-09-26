package com.kabiru.alpha.rest;

import com.kabiru.alpha.feign.SampleFeign;
import com.kabiru.alpha.models.SampleClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("com.kabiru.alpha.feign")
@Component
public class SampleRest implements CommandLineRunner {

    private final SampleFeign sampleFeign;

    public SampleRest(SampleFeign sampleFeign) {
        // Empty constructor
        this.sampleFeign = sampleFeign;
    }

    @Override
    public void run(String... args) throws Exception {

        // 1. Create sample
        // SampleClass sampleClass = sampleFeign.createSample( new SampleClass( "kabiru" ) );
        // System.out.println( sampleClass );

        // 2. Patch
        //sampleClass.setUsername("mwangi");
        //SampleClass update_sample = sampleFeign.updateSample( sampleClass.getId(), sampleClass );
        //System.out.println( update_sample );
    }
}
