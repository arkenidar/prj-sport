package com.arkenidar;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sport scores!");

        List<Team> teams = new LinkedList<>();

        Team team1 = new Team("team1");
        Team team2 = new Team("team2");
        Team team3 = new Team("team3");

        teams.add(team1);
        teams.add(team2);
        teams.add(team3);

        match(team1, 2, team2, 0);
        match(team1, 2, team2, 2);
        match(team1, 1, team3, 7);

        teams = teams.stream().sorted(Comparator.comparingInt(Team::getScore).reversed()).collect(Collectors.toList());

        teams.forEach(System.out::println);

        Comparator<Team> scored = Comparator.comparing(Team::getScored);
        Comparator<Team> received = Comparator.comparing(Team::getReceived);

        System.out.println("scored max: " + teams.stream().max(scored).get());
        System.out.println("received max: " + teams.stream().max(received).get());
    }

    private static void match(Team team1, int points1, Team team2, int points2) {
        if (points1 == points2) {
            team1.incrementScore(1);
            team2.incrementScore(1);
        } else if (points1 < points2) {
            team1.incrementScore(0);
            team2.incrementScore(2);
        } else if (points1 > points2) {
            team1.incrementScore(2);
            team2.incrementScore(0);
        }

        team1.incrementScored(points1);
        team1.incrementReceived(points2);

        team2.incrementScored(points2);
        team2.incrementReceived(points1);
    }
}