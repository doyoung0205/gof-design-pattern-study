package me.doyoung.gof.bridge.before;

import me.doyoung.gof.bridge.Champion;

public class PollPartyKisa implements Champion {
    @Override
    public void move() {
        System.out.println("PollParty 카이사 move");
    }

    @Override
    public void skillQ() {
        System.out.println("PollParty 카이사 Q");
    }

    @Override
    public void skillW() {
        System.out.println("PollParty 카이사 W");
    }

    @Override
    public void skillE() {
        System.out.println("PollParty 카이사 E");
    }

    @Override
    public void skillR() {
        System.out.println("PollParty 카이사 R");
    }
}
