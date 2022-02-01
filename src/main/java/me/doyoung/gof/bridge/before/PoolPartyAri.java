package me.doyoung.gof.bridge.before;

import me.doyoung.gof.bridge.Champion;

public class PoolPartyAri implements Champion {
    @Override
    public void move() {
        System.out.println("PollParty 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("PollParty 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("PollParty 아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("PollParty 아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("PollParty 아리 R");
    }
}
