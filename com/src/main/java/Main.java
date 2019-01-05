package com.src.main.java;

import java.util.ArrayList;

import static com.src.main.java.SimpleDotCom.KILL;

public class Main {
    private static int numberOfGuesses = 0;

    public static void main( String[] args ) {

        boolean isAlive = true;
        final GameHelper gameHelper = new GameHelper();
        final SimpleDotCom simpleDotCom = new SimpleDotCom();

        ArrayList<Integer> locations = gameSetup();
        simpleDotCom.setLocations( locations );

        System.out.println( "Welcome to the game..." );

        while ( isAlive ) {
            String userInput = gameHelper.userInput();
            final String result = simpleDotCom.checkGuess( userInput );

            numberOfGuesses++;

            if ( KILL.equals( result ) ) {
                isAlive = false;
                System.out.println( "attempts taken -> " + numberOfGuesses );
            }

            System.out.println( result );

        }

    }

    private static ArrayList<Integer> gameSetup() {
        int randomNumber = (int) ( Math.random() * 10 );
        ArrayList<Integer> locations = new ArrayList<>();
        addLocations( randomNumber, locations );
        return locations;
    }

    private static void addLocations( int randomNumber, ArrayList<Integer> locations ) {
        locations.add( randomNumber );
        locations.add( randomNumber + 1 );
        locations.add( randomNumber + 2 );
    }
}
