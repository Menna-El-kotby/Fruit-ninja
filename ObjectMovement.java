package javaapplication3;

import java.io.File;
import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;

public class ObjectMovement implements GameActions {

    int numberFruitsSliced = 0;
    int lives;
    private int bestScore;
    int rounds = 0;

    private static ObjectMovement instance = new ObjectMovement();
    Controller controller = new Controller();

    private ObjectMovement() {

    }

    public static ObjectMovement getInstance() {
        return instance;
    }

    @Override
    public void sliceObjects(ArrayList<GameObject> gameobjects, MouseMove handler) {
        java.util.Iterator<GameObject> iterator = gameobjects.iterator();
        while (iterator.hasNext()) {
            GameObject go = iterator.next();
            if (handler.getX() <= go.getXLocation() + 80 && handler.getX() > go.getXLocation() && !go.isSliced()) {
                if (handler.getY() <= go.getYLocation() + 80 && handler.getY() > go.getYLocation()) {
                    go.slice();

                    if (go.getName().compareTo("bomb") != 0 && go.getName().compareTo("fatal bomb") != 0 && go.getName().compareTo("dragonfruit") != 0 && go.getName().compareTo("pome") != 0) {
                        numberFruitsSliced++;
                    } else if (go.getName().compareTo("bomb") == 0 && controller.player.getLives() != 0) {
                        lives--;

                    } else if (go.getName().compareTo("fatal bomb") == 0) {
                        lives = 0;

                    } else if (go.getName().compareTo("dragonfruit") == 0 || go.getName().compareTo("pome") == 0) {
                        numberFruitsSliced = numberFruitsSliced + 5;
                    }

                }

            }

            if (!go.isMovingUp() && !go.isSliced() && go.getYLocation() > 480 && go.getName().compareTo("bomb") != 0 && go.getName().compareTo("fatal bomb") != 0 && lives != 0 && !go.isEntered()) {

                go.setEntered(true);
                lives--;

            }

            controller.player.setPalyerName("Adam Parker");
            controller.player.setCurrentScore(numberFruitsSliced);
            controller.player.setLives(lives);
            controller.player.setBestScore(max(controller.player.getBestScore(), controller.player.getCurrentScore()));
            this.saveGame();

        }
    }

    @Override
    public void saveGame() {

        try {

            XMLReadSave.savePlayer("savedplayer", controller.player);

        } catch (JAXBException ex) {
            Logger.getLogger(GamePanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void loadGame(File newFile
    ) {

        if (newFile.length() != 0) {

            try {

                controller.player = XMLReadSave.readPlayer("savedplayer");

            } catch (JAXBException ex) {
                Logger.getLogger(ObjectMovement.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            lives = controller.player.getLives();
            bestScore = controller.player.getBestScore();

        } else {

            lives = 3;
            bestScore = 0;

        }

    }

    @Override
    public void ResetGame() {
        controller.player.setLives(3);
        numberFruitsSliced = 0;

    }

    @Override
    public void setLevel(ArrayList gameobjects) {
        if (controller.player.getCurrentScore() >= 25) {
            javaapplication3.Level level = new javaapplication3.Level(controller.player.getCurrentScore());
            level.velocity(gameobjects);

        } else {
            javaapplication3.Level level = new javaapplication3.Level(controller.player.getCurrentScore());
            level.velocity(gameobjects);

        }
    }

}
