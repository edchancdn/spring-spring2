package com.example.springspring2;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component //considen this as a bean
@Data
public class Student {
    private final String name;
    private final String id;
}
