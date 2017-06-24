package com.identity.enums;

import com.identity.enums.Days;
import com.spring.practice.Configurations.CDPlayerConfig;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.util.Arrays;


/**
 * Created by ajkumar on 4/27/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class DaysTest {

    @Test
    public void printDays(){
        System.out.println();
        System.out.println(Days.valueOf(Days.MON.name()));
        System.out.println(Arrays.asList(Days.values()));
    }
}
