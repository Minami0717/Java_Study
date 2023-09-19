package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;
import com.green.java.ioc.Woofer;

public class TvFactory {
    public static Tv getInstance(String speaker) {
        Woofer woofer = new BoWoofer();
        switch (speaker) {
            case "Apple":
                Speaker s1 = new AppleSpeaker(woofer);
                return new SamSungTv(s1);
            case "Harman":
                Speaker s2 = new HarmanSpeaker(woofer);
                return new SamSungTv(s2);
        }
        return null;
    }
}
