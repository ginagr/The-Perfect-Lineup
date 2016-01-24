package com.bignerdranch.android.theperfectlineup;

/**
 * Created by Maryann on 1/23/16.
 */
public class Coxswain extends Athlete {
    String firstName, lastName;
    double weight;

    Coxswain(String firstName, String lastName, double weight) {
        super(firstName, lastName, weight);
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
    }
}
