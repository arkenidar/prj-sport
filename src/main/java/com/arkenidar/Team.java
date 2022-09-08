package com.arkenidar;

public class Team {
    private String name;
    private int score = 0, scored = 0, received = 0;

    public Team(String name) {
        setName(name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incrementScore(int increment) {
        setScore(getScore() + increment);
    }

    public int getScored() {
        return scored;
    }

    public void setScored(int scored) {
        this.scored = scored;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public void incrementScored(int points) {
        setScored(getScored() + points);
    }

    public void incrementReceived(int points) {
        setReceived(getReceived() + points);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", scored=" + scored +
                ", received=" + received +
                '}';
    }
}
