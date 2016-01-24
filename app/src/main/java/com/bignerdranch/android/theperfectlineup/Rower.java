package com.bignerdranch.android.theperfectlineup;

/**
 * Created by Maryann on 1/23/16.
 */
public class Rower extends Athlete{
    String firstName, lastName;
    double twokTime, sixkTime, weight;
    boolean isPort;     // rower's right

    public Rower(String firstName, String lastName, double weight, double twokTime, double sixkTime, boolean isPort){
        super(firstName, lastName, weight);
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.twokTime = twokTime;
        this.sixkTime = sixkTime;
        this.isPort = isPort;
    }

}
