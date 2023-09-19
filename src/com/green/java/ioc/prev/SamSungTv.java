package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;
import com.green.java.ioc.prev.HarmanSpeaker;

public class SamSungTv implements Tv {
    private Speaker speaker;

    public SamSungTv() {
        speaker = new HarmanSpeaker();
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
