package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Woofer;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;


    public AppleSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void volumeUp() {
        System.out.println("apple Speaker volumeUP");
        woofer.sound();
    }

    @Override
    public void volumeDown() {
        System.out.println("apple Speaker volumeDown");
        woofer.sound();
    }
}
