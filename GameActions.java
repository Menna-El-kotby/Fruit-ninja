package javaapplication3;

import java.io.File;
import java.util.ArrayList;

public interface GameActions {

    //public void updateObjectsLocations();

    public void sliceObjects(ArrayList<GameObject> gameobjects, MouseMove handler);

    public void saveGame();

    public void loadGame(File newFile);

    public void ResetGame();

    public void setLevel(ArrayList<GameObject> gameobjects);

}
