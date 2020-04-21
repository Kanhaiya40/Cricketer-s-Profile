package com.MyProject.MyApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Profile_Code")
    private int countryCode;
    @JsonProperty("Country_Team")
    private String countryTeam;
    @JsonProperty("Ipl_Team")
    private String iplTeam;
    @JsonProperty("Domestic_Team")
    private String domesticTeam;

    public String getCountryTeam() {
        return countryTeam;
    }

    public void setCountryTeam(String countryTeam) {
        this.countryTeam = countryTeam;
    }

    public String getIplTeam() {
        return iplTeam;
    }

    public void setIplTeam(String iplTeam) {
        this.iplTeam = iplTeam;
    }

    public String getDomesticTeam() {
        return domesticTeam;
    }

    public void setDomesticTeam(String domesticTeam) {
        this.domesticTeam = domesticTeam;
    }



}
