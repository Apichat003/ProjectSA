package com.cpe.sa.main.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    private String userName;
    @JsonIgnore
    private String passWord;
    
    @OneToOne
    private personnel personnel;

    protected User(){}

    public User(Long userId){
        this.id = userId;
    }

    public User(String userName, String passWord, Long personnelID){
        
        personnel person = new personnel(personnelID);

        this.personnel = person;
        this.userName = userName;
        this.passWord = passWord;
    }

}
