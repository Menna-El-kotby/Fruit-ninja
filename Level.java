
package javaapplication3;

import java.util.ArrayList;


public class Level {
     private int score;
    private LevelState levelstate;
   
    public Level(int score) {
        this.setScore(score);
    }

    public void velocity(ArrayList gameobjects) {
        levelstate.velocity(gameobjects);
    }

  

    public void setScore(int score) {
        this.score = score;

        if (score >= 10 && score<20) {

            levelstate = new Level2();
        }
        if (score >= 20) {
            levelstate = new Level3();
        }
        if (score < 10) {
            levelstate = new Level1();

        }
      
    }
  
}
