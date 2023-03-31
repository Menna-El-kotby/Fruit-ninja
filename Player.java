package javaapplication3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "player")
@XmlAccessorType(XmlAccessType.FIELD)
public class Player {

    @XmlElement(name = "playername")
    private String palyerName;
    @XmlElement(name = "currentscore")
    private int currentScore;
    private Player player;
    @XmlElement(name = "lives")
    private int lives;
    @XmlElement(name = "bestScore")
    private int bestScore;

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    @XmlElement(name = "rounds")
    private int rounds;

    public int getBestScore() {
        return bestScore;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }
    private static Player instance = new Player();

    private Player() {
    }

    public static Player getInstance() {
        return instance;
    }

    public String getPalyerName() {
        return palyerName;
    }

    public void setPalyerName(String palyerName) {
        this.palyerName = palyerName;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int gameScore) {
        this.currentScore = gameScore;
    }

   

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

}
