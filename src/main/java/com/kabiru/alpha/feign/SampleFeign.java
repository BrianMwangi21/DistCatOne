package com.kabiru.alpha.feign;

import com.kabiru.alpha.models.SampleClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="sampleFeign", url="http://127.0.0.1:8000/", configuration = FeignConfig.class)
public interface SampleFeign {

    // Get all samples
    @RequestMapping( method = RequestMethod.GET, value = "all-samples" )
    List<SampleClass> getAllSamples();

    // Create new sample
    @RequestMapping( method = RequestMethod.POST, value = "create-sample" )
    SampleClass createSample(@RequestBody SampleClass sampleClass );

    // Get sample
    @RequestMapping( method = RequestMethod.POST, value = "samples/{id}" )
    SampleClass getSampleById(@PathVariable( name = "id" ) long id);

    // Patch sample
    @RequestMapping( method = RequestMethod.POST, value = "samples/{id}" )
    SampleClass updateSample(@PathVariable( name = "id") long id, @RequestBody SampleClass sampleClass );
}
