package com.kabiru.alpha.feign;

import com.kabiru.alpha.models.SampleClass;
import com.kabiru.alpha.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="studentFeign", url="http://10.51.10.111:2200/", configuration = FeignConfig.class)
public interface StudentFeign {

    // Create new student
    @RequestMapping( method = RequestMethod.POST, value = "students" )
    Student createStudent(@RequestBody Student student);
}
