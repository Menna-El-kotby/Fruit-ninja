package javaapplication3;

import java.util.ArrayList;

public class Level1 implements LevelState {

    @Override
    public void velocity(ArrayList gameobjects) {
        java.util.Iterator<GameObject> iterator = gameobjects.iterator();
        while (iterator.hasNext()) {
            GameObject go = iterator.next();

            go.setInitialVelocity(go.getInitialVelocity());
            go.setFallinglVelocity(go.getFallingVelocity());

        }

    }
}
