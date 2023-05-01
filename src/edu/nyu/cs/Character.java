package edu.nyu.cs;

public class Character extends OrderedThing{
    private char c;
    public Character(char c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return String.valueOf(c);
    }
}