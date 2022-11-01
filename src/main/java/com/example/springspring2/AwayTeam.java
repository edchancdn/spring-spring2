package com.example.springspring2;

import lombok.Data;

@Data
public class AwayTeam implements Team {

    private final String country;
    private final String teamName;

    @Override
    public String team() {
        return country + " " + teamName;
    }

    public void prepTeam() {
        System.out.println("AWAY team prepping...");
    }

    public void destroy() {
        System.out.println("AWAY team leaving...");
    }
}
