package com.green.java.ch07;

public class MyTv extends Speaker {
    int channel;

    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
class MyTv2 {
    Speaker speaker;
    int channel;

    MyTv2() {
        speaker = new Speaker();
    }

    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
    void volumeUp() {
        speaker.volumeUp();
    }
    void volumeDown() {
        speaker.volumeDown();
    }
    int getVolume() {
        return speaker.volume;
    }
}
class Speaker {
    int volume;

    void volumeUp() {
        volume++;
    }
    void volumeDown() {
        volume--;
    }
}
