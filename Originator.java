package javaapplication3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Originator {

    private int score;
    private static Originator instance = new Originator();

    private Originator() {
    }

    public static Originator getInstance() {
        return instance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        //System.out.println("Originator : setting player score to " + score);
        this.score = score;

    }

    public Memento save() {
        //System.out.println("Originator : saving to memento ");
        return new Memento(score);
    }

    public int restore(Memento m) {
        //System.out.println("Originator : restoring score " + m.getScore());
        return m.getScore();

    }
}
