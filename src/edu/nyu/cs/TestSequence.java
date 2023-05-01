package edu.nyu.cs;
import java.util.ArrayList;

public class TestSequence {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("Hi my name is Lauren and I study CS at NYU!");

        System.out.println("First word : " + ((Word)sentence.getFirst()));
        System.out.println("Last word : " + ((Word)sentence.getLast()));

        ArrayList<OrderedThing> sentenceSequence = sentence.getSequence();

        for (OrderedThing element : sentenceSequence) {
        if (element instanceof Word) {
            Word w = (Word) element;
            ArrayList<OrderedThing> wordSequence = w.getSequence();
            System.out.println();
            System.out.println("Word at position " + w.getPosition() + ":");
            
            for (OrderedThing c : wordSequence) {
                System.out.print(c);
            }
        System.out.println();
        } else {
            System.out.println(element);
        }
}}}
