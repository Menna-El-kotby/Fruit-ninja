package javaapplication3;

import java.io.File;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication3.GamePanel.View;
import javax.xml.bind.JAXBException;

public class Controller {

    Player player = Player.getInstance();
    File newFile = new File("savedplayer");
    private View view;

     public Controller() {
       

    }
    public Controller(Player model, View view) {
        this.player = model;
        this.view = view;

    }

    public void setplayerscore(int score) {
        player.setCurrentScore(score);
    }

    public int getplayerscore() {
        return player.getCurrentScore();
    }

    public void setplayerbestscore(int bestscore) {
        player.setBestScore(bestscore);
    }

    public int getplayerbestscore() {
        return player.getBestScore();
    }

    public void setplayerlives(int playerlives) {
        player.setLives(playerlives);
    }

    public int getplayerlives() {
        return player.getLives();
    }

    public void updateView() {
        view.ShowplayerData(player.getCurrentScore(), player.getBestScore(), player.getLives());
    }

}


