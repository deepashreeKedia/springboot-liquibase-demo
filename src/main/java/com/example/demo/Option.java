package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Option {

    @Id
    public String id;

    public String optionType;
}
