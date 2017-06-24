package com.spring.practice.components;

import com.spring.practice.com.spring.practice.intf.CompactDisc;
import com.spring.practice.com.spring.practice.intf.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ajkumar on 4/20/17.
 */

public class CDPlayer  implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }
}
