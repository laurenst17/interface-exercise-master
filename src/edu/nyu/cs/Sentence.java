package edu.nyu.cs;
import java.util.ArrayList;

public class Sentence implements SequentiallyOrdered{
    private ArrayList<OrderedThing> sequence;

    public Word getFirst(){
        return (Word) sequence.get(0);
    }
    public Word getLast(){
        return (Word) sequence.get(sequence.size()-1);
    }
    public ArrayList<OrderedThing> getSequence(){
        return sequence;
    }

    public Sentence(String sentence){
        this.sequence = new ArrayList<OrderedThing>();
        String[] words = sentence.split("[^\\w']+");
        for (int i = 0; i<words.length;i++){
            this.sequence.add(new Word(words[i],i));
        }
    }

    
    
    
}

