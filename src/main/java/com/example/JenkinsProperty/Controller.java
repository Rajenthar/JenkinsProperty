package com.example.JenkinsProperty;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/test")
public class Controller {

    @Autowired
    private MasterDataProperties masterDataProperties;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/properties")
    public String getProperties() {
        return new PropertyModel(masterDataProperties.getSub1(), masterDataProperties.getSub2(), masterDataProperties.getSub3(), masterDataProperties.getProperty2(), masterDataProperties.getTest()).toString();
    }
}
