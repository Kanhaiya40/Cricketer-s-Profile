package com.MyProject.MyApp.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Players_ID")
    private int playersId;
    @JsonProperty("Name")
    private String  pname;
    @JsonProperty("Age")
    private int age;
    @JsonProperty("Odi")
    private  int noOfOdiPlayed;
    @JsonProperty("Test")
    private  int noOfTestPlayed;
    @JsonProperty("T20")
    private  int noOfT20layed;
    @JsonProperty("IPL")
    private int noOfIplPlayed;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JsonProperty("Performance")
    private Set<Performance> perform;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JsonProperty("Team")
    private Set<Team> team;

    public Set<Performance> getPerform() {
        return perform;
    }

    public void setPerform(Set<Performance> perform) {
        this.perform = perform;
    }

    public Set<Team> getTeam() {
        return team;
    }

    public void setTeam(Set<Team> team) {
        this.team = team;
    }

    public void setPlayersId(int playersId) {
        this.playersId = playersId;
    }

    public int getPlayersId() {
        return playersId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoOfOdiPlayed() {
        return noOfOdiPlayed;
    }

    public void setNoOfOdiPlayed(int noOfOdiPlayed) {
        this.noOfOdiPlayed = noOfOdiPlayed;
    }

    public int getNoOfTestPlayed() {
        return noOfTestPlayed;
    }

    public void setNoOfTestPlayed(int noOfTestPlayed) {
        this.noOfTestPlayed = noOfTestPlayed;
    }

    public int getNoOfT20layed() {
        return noOfT20layed;
    }

    public void setNoOfT20layed(int noOfT20layed) {
        this.noOfT20layed = noOfT20layed;
    }

    public int getNoOfIplPlayed() {
        return noOfIplPlayed;
    }

    public void setNoOfIplPlayed(int noOfIplPlayed) {
        this.noOfIplPlayed = noOfIplPlayed;
    }

    public Players() {
    }


}
