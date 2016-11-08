package com.example.user.darts;

/**
 * Created by user on 07/11/2016.
 */

public class Player {
    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.nickname + ")" ;
    }
}
