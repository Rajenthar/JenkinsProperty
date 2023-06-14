package com.example.JenkinsProperty;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MasterDataProperties {

    @Value("${jenkins.property1.sub1}")
    private String sub1;

    @Value("${jenkins.property1.sub2}")
    private String sub2;

    @Value("${jenkins.property1.sub3}")
    private String sub3;
    @Value("${jenkins.property2}")
    private String property2;

    @Value("${test.property}")
    private String test;
}
