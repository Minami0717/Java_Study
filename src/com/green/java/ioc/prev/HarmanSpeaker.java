package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Woofer;
import com.green.java.ioc.next.BoWoofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker() {
        woofer = new BoWoofer();
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
