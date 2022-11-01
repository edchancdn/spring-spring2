package com.example.springspring2;

import com.example.springspring2.conf.AppConfig;
import com.example.springspring2.conf.StudentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
public class SpringSpring2Application {

    private Student student;

    public SpringSpring2Application(Student student) {
        this.student = student;
    }

    public static void main(String[] args) {
        //SpringApplication.run(SpringSpring2Application.class, args);

        //ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, StudentConfig.class);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.springspring2");

        // -- 3
        Game game = context.getBean(Game.class);
        System.out.println(game.playGame());

        // -- 1
        //Game game = context.getBean("game", Game.class);
        //Team raptor = context.getBean("raptors", Team.class);
        //System.out.println("context.getBean(Student.class) = " + context.getBean(Student.class));
        //System.out.println(raptor);
        //System.out.println("game = " + game.playGame(raptor));

        // -- 2
        //Student student = context.getBean(Student.class);
        //Team team = context.getBean("home", Team.class);
        //System.out.println("team = " + team);
        //System.out.println(student);

        //context.registerShutdownHook();
    }

}
