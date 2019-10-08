package com.kabiru.alpha.rest;

import com.kabiru.alpha.feign.NetflixFeign;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRest implements CommandLineRunner {

    private final NetflixFeign netflixFeign;

    public SampleRest(NetflixFeign netflixFeign) {
        // Empty constructor
        this.netflixFeign = netflixFeign;
    }

    @Override
    public void run(String... args) throws Exception {

        // Where the program runs
    }
}
