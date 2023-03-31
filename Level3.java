package javaapplication3;

import java.util.ArrayList;

public class Level3 implements LevelState {

    Factory f = new Factory();

    @Override
    public void velocity(ArrayList gameobjects) {

        java.util.Iterator<GameObject> iterator = gameobjects.iterator();
         
        while (iterator.hasNext()) {
            GameObject go = iterator.next();
            go.setInitialVelocity(go.getInitialVelocity()+3);
            go.setFallinglVelocity(go.getFallingVelocity()+3);

        }

    }

}
