package it.develhope.classesandobjects;

public class CompetitionRules
{
    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";
    public CompetitionRules()
    {
        this.competitionRule1 = competitionRule1;
        this.competitionRule2 = competitionRule2;
        this.competitionRule3 = competitionRule3;
    }
    public void printRules()
    {
        System.out.println(this.competitionRule1+"\n"+this.competitionRule2+"\n"+this.competitionRule3);
    }
}