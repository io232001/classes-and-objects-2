package it.develhope.classesandobjects;

public class Programmer
{
    public String name;

    public String programminglanguage;
    public int yearsOfExerience;
    public Programmer(String name, String programminglanguage,int yearsOfExerience)
    {
        this.name = name;
        this.programminglanguage = programminglanguage;
        this.yearsOfExerience = yearsOfExerience;
    }
    public void printProgrammerDetails()
    {
        System.out.println(this.name+this.programminglanguage+this.yearsOfExerience);
    }
}
