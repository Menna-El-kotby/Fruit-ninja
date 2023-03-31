package javaapplication3;

import java.util.ArrayList;

public class Level2 implements LevelState {

    @Override
    public void velocity(ArrayList gameobjects) {
        java.util.Iterator<GameObject> iterator = gameobjects.iterator();
        while (iterator.hasNext()) {
            GameObject go = iterator.next();
            go.setInitialVelocity(go.getFallingVelocity()+3);
            go.setFallinglVelocity(go.getFallingVelocity()+3);

        }

    }
}
