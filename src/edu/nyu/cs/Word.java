package edu.nyu.cs;
import java.util.ArrayList;


public class Word extends OrderedThing implements SequentiallyOrdered{

    private ArrayList<Character> characters;
    private int position;

    public Word(String s, int position) {
        this.position = position;
        characters = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c = new Character(s.charAt(i));
            characters.add(c);
        }}
    
    public OrderedThing getFirst(){
        return characters.get(0);
        }

    public OrderedThing getLast(){
        return characters.get(characters.size() - 1);
        }

    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> list = new ArrayList<OrderedThing>();
            for (Character c : characters) {
                list.add(c);
            }
        return list;
        }

    public int getPosition(){
        return position;
    }
    
}
