package com.example.springspring2;

import lombok.Data;

@Data // getters, setters, toString, equals, hashcode, required argument constructor
// same as @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
public class HomeTeam implements Team{
    // when you put a final in a variable - becomes constant - through inline or constructor
        // variable becomes required
    // when you put a final in a class - you cannot inherit it. Example String
    // when you put final in a method - it cannot be overridden, it cannot be overloaded
    private final String country;
    private final String teamName;

    @Override
    public String team() {
        return country + " " + teamName;
    }

    public void prepTeam() {
        System.out.println("HOME team prepping...");
    }

    public void destroy() {
        System.out.println("HOME team leaving...");
    }
}
