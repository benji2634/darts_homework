package com.example.user.darts;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Rankings {

    ArrayList<Player> mPlayers;

    public Rankings() {
        mPlayers = new ArrayList<Player>();
    }

    public Rankings(ArrayList<Player> players) {
        mPlayers = new ArrayList<Player>(players);
    }

    public void add(Player newPlayer) {
        mPlayers.add(newPlayer);
    }

}
