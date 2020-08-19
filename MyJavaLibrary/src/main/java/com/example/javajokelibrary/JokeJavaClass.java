package com.example.javajokelibrary;

import java.util.ArrayList;
import java.util.Random;

public class JokeJavaClass
{
	Random rand;
    ArrayList<String> jokesList;
    
    public JokeJavaClass()
    {
        rand = new Random();
        jokesList = new ArrayList<String>();
        //4 jokes on big football results in UEFA Champions League

        //Bayern Munich 8 - 2 Barcelona
        jokesList.add("Why did Thomas Muller refuse to have breakfast in the morning?\n\nBecause he 8-2 much last night!");

        //Arsenal LB Sead Kolasinac's parody name
        jokesList.add("What is Sead Kolasinac's favourite cool drink brand?\n\nIt's Coca Colasinac");

        //Barcelona 6 - 1 Paris Saint Germain
        jokesList.add("What is Luis Suarez's favourite music band?\n\nIt's 6-1 direction");
    }

    public String getRandomJoke()
    {
        return jokesList.get(rand.nextInt(jokesList.size()));
    }
}