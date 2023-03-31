package javaapplication3;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class NewMain {

    public static void main(String[] args) throws JAXBException {
        Player player = Player.getInstance();
        player.setPalyerName("Adam");
        player.setBestScore(5);
        player.setLives(3);
        player.setCurrentScore(3);
        CareTaker caretaker = CareTaker.getInstance();
        Originator originator = Originator.getInstance();
        originator.setScore(player.getCurrentScore());
        caretaker.addMemento(originator.save());
        player.setCurrentScore(9);
        originator.setScore(player.getCurrentScore());
        caretaker.addMemento(originator.save());
        player.setCurrentScore(2);
        originator.setScore(player.getCurrentScore());
        caretaker.addMemento(originator.save());
        originator.restore(caretaker.getMemento(1));

    }
}
