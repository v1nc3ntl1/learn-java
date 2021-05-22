package com.learning;

public class Main {

    public static void main(String[] args) {
        League<BadmintonTeam> badmintonTeamLeague = new League<>();
        League<SoccerTeam> soccerTeamLeague = new League<>();

        badmintonTeamLeague.addTeam(new BadmintonTeam("teamA"));
        badmintonTeamLeague.addTeam(new BadmintonTeam("teamC"));
        badmintonTeamLeague.addTeam(new BadmintonTeam("teamB"));

        badmintonTeamLeague.printTeams();
        soccerTeamLeague.addTeam(new SoccerTeam("team1"));
        soccerTeamLeague.addTeam(new SoccerTeam("team3"));
        soccerTeamLeague.addTeam(new SoccerTeam("team2"));

        soccerTeamLeague.printTeams();
    }
}
