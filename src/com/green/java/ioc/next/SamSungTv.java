package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;

public class SamSungTv implements Tv {
    private Speaker speaker;

    public SamSungTv(Speaker speaker) {
        this.speaker = speaker;
    }
    @Override
    public void turnOn() {
        System.out.println("Samsung tv on");
        speaker.volumeUp();
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung tv off");
        speaker.volumeDown();
    }
}
