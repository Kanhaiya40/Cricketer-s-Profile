package com.MyProject.MyApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Permance_Id")
    private int pid;
    @JsonProperty("Odi_Runs")
    private int odiRuns;
    @JsonProperty("Test_Runs")
    private int testRuns;
    @JsonProperty("T20_Runs")
    private int t20Runs;
    @JsonProperty("Ipl_Runs")
    private int iplRuns;
    @JsonProperty("Odi_Wickets")
    private int odiWickets;
    @JsonProperty("Test_Wickets")
    private int testWickets;
    @JsonProperty("T20_Wickets")
    private int t20Wickets;
    @JsonProperty("Ipl_Wickets")
    private int iplWickets;
    @JsonProperty("Catch_Odi")
    private int catchInOdi;
    @JsonProperty("Catch_Test")
    private int catchInTest;
    @JsonProperty("Catch_T20")
    private int catchInT20;
    @JsonProperty("Catch_Ipl")
    private  int catchInIpl;

    public int getOdiRuns() {
        return odiRuns;
    }

    public void setOdiRuns(int odiRuns) {
        this.odiRuns = odiRuns;
    }

    public int getTestRuns() {
        return testRuns;
    }

    public void setTestRuns(int testRuns) {
        this.testRuns = testRuns;
    }

    public int getT20Runs() {
        return t20Runs;
    }

    public void setT20Runs(int t20Runs) {
        this.t20Runs = t20Runs;
    }

    public int getIplRuns() {
        return iplRuns;
    }

    public void setIplRuns(int iplRuns) {
        this.iplRuns = iplRuns;
    }

    public int getOdiWickets() {
        return odiWickets;
    }

    public void setOdiWickets(int odiWickets) {
        this.odiWickets = odiWickets;
    }

    public int getTestWickets() {
        return testWickets;
    }

    public void setTestWickets(int testWickets) {
        this.testWickets = testWickets;
    }

    public int getT20Wickets() {
        return t20Wickets;
    }

    public void setT20Wickets(int t20Wickets) {
        this.t20Wickets = t20Wickets;
    }

    public int getIplWickets() {
        return iplWickets;
    }

    public void setIplWickets(int iplWickets) {
        this.iplWickets = iplWickets;
    }

    public int getCatchInOdi() {
        return catchInOdi;
    }

    public void setCatchInOdi(int catchInOdi) {
        this.catchInOdi = catchInOdi;
    }

    public int getCatchInTest() {
        return catchInTest;
    }

    public void setCatchInTest(int catchInTest) {
        this.catchInTest = catchInTest;
    }

    public int getCatchInT20() {
        return catchInT20;
    }

    public void setCatchInT20(int catchInT20) {
        this.catchInT20 = catchInT20;
    }

    public int getCatchInIpl() {
        return catchInIpl;
    }

    public void setCatchInIpl(int catchInIpl) {
        this.catchInIpl = catchInIpl;
    }


}
