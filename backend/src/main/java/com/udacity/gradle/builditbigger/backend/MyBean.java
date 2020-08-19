package com.udacity.gradle.builditbigger.backend;

import com.example.javajokelibrary.JokeJavaClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private JokeJavaClass mJokeObject;

    public MyBean() {
        mJokeObject = new JokeJavaClass();
    }

    public String getJoke() {
        return mJokeObject.getRandomJoke();
    }
}