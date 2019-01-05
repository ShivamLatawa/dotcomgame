package com.src.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String userInput() {
        System.out.println( "enter a number -> " );

        String inputLine = null;

        try {
            BufferedReader is = new BufferedReader( new InputStreamReader( System.in ) );
            inputLine = is.readLine();
            if ( inputLine.length() == 0 )
                return null;
        } catch ( IOException e ) {
            System.out.println( e.getMessage() );
        }

        return inputLine;
    }
}
