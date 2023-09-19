package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Woofer;
import com.green.java.ioc.next.BoWoofer;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker() {
        woofer = new BoWoofer();
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
