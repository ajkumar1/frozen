package com.spring.practice.components;

import com.spring.practice.com.spring.practice.intf.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by ajkumar on 4/19/17.
 */
@Component
public class TanhaDilShaan implements CompactDisc {

    private String artist = "Shaan";
    private String title = "Tanha Dil Tanha safar";

    public void play() {
        System.out.println("Playing: ");
    }
}



