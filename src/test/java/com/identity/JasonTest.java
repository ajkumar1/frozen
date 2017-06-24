package com.identity;

import com.identity.jackson.JsonParser;
import com.spring.practice.Configurations.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ajkumar on 5/2/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class JasonTest {

    @Test
    public void jsonToObjectTest(){
        JsonParser.INSTANCE.jsonToObject();
    }
}
