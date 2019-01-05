package com.src.main.java;

import java.util.ArrayList;

public class Main {
    public static void main( String[] args ) {

        //input helper class
        // takes input from the user

        final SimpleDotCom simpleDotCom = new SimpleDotCom();

        int randomNumber = (int) Math.random() * 10;

        ArrayList locations = new ArrayList();
        locations.add( randomNumber );
        locations.add( randomNumber + 1 );
        locations.add( randomNumber + 2 );

        simpleDotCom.setLocations( locations );

        locations.forEach( location ->
                System.out.println( simpleDotCom.checkGuess( (int) location ) ) );

    }
}
