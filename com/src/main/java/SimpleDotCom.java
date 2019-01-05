package com.src.main.java;

import java.util.ArrayList;

public class SimpleDotCom {

    public static final String MISS = "miss";
    public static final String HIT = "hit";
    public static final String KILL = "kill";
    public static int count = 0;
    private ArrayList locations;

    public void setLocations( ArrayList locations ) {
        this.locations = locations;
    }

    public String checkGuess( int guess ) {
        if ( locations.contains( guess ) ) {
            count++;

            if ( count == locations.size() ) {
                return KILL;
            }
            return HIT;
        }

        return MISS;
    }
}
