package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;


    public HarmanSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void volumeUp() {
        System.out.println("Harman Speaker up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Harman Speaker down");
    }
}
