package com.src.main.java;

import java.util.ArrayList;

public class SimpleDotCom {

    private static final String MISS = "miss";
    private static final String HIT = "hit";
    public static final String KILL = "kill";
    private static int count = 0;
    private ArrayList<Integer> locations;

    public void setLocations( ArrayList<Integer> locations ) {
        this.locations = locations;
    }

    public String checkGuess( String guess ) {
        if ( locations.contains( Integer.parseInt( guess ) ) ) {
            count++;

            if ( count == locations.size() ) {
                return KILL;
            }
            return HIT;
        }

        return MISS;
    }
}
