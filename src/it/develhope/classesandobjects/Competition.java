package it.develhope.classesandobjects;

public class Competition
{
    public static void main(String args[])
    {
        //non riesco a printare THE RULES

        Programmer p1, p2, p3, p4;
        p1= new Programmer("Mirko ", "Java ",4);
        p2= new Programmer("Giovanni ","HTML ",1);
        p3= new Programmer("Gabriele ","Visual basic ",7);
        p4= new Programmer("Mauro ","Java ",6);

        Team team1, team2;
        team1 = new Team("White",p1,p2);
        team2 = new Team("Black", p3, p4);

        team1.printTeamDetails();
        team2.printTeamDetails();
    }
}
