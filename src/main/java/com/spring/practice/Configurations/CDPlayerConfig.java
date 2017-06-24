package com.spring.practice.Configurations;

import com.spring.practice.PackageForComponentScanning;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ajkumar on 4/19/17.
 */

@Configuration
@ComponentScan(basePackageClasses = {PackageForComponentScanning.class})
public class CDPlayerConfig {
}

