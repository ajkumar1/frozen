package com.spring.practice.components;

import com.spring.practice.Configurations.CDPlayerConfig;
import com.spring.practice.com.spring.practice.intf.CompactDisc;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by ajkumar on 4/19/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class TanhaDilShaanTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {

        assertNotNull(cd);
    }

    @Test
    public void playCDTest(){
        cd.play();
    }
}

