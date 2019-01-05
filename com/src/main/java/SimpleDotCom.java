package com.src.main.java;

import java.util.ArrayList;

class SimpleDotCom {

    private static final String MISS = "miss";
    private static final String HIT = "hit";
    static final String KILL = "kill";
    private ArrayList<Integer> locations;

    void setLocations( ArrayList<Integer> locations ) {
        this.locations = locations;
    }

    String checkGuess( String guess ) {
        final int guessedValue = Integer.parseInt( guess );

        if ( locations.contains( guessedValue ) ) {

            final int indexOfGuessedValue = locations.indexOf( guessedValue );

            locations.remove( indexOfGuessedValue );

            if ( locations.isEmpty() ) {
                return KILL;
            }
            return HIT;
        }

        return MISS;
    }
}
