package com.example.springspring2.conf;

import com.example.springspring2.AwayTeam;
import com.example.springspring2.Game;
import com.example.springspring2.HomeTeam;
import com.example.springspring2.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:team.properties")
public class AppConfig {

    //@Value("${team.name: 'HomeTeam'}")
    //private String teamName;

    @Bean (name = "home", initMethod = "prepTeam", destroyMethod = "destroy")
    public Team homeTeam(
            @Value("${team.home.city: 'Toronto'}") String city,
            @Value("${team.home.name: 'Raptors'}") String name) {
        return new HomeTeam(city, name);
    }

    @Bean (name = "away", initMethod = "prepTeam", destroyMethod = "destroy")
    public Team awayTeam(
            @Value("${team.away.city: 'Ottawa'}") String city,
            @Value("${team.away.name: 'Senators'}") String name) {
        return new AwayTeam(city, name);
    }

    //@Bean
    //public Game game() {
    //    return new Game();
    //}
}
