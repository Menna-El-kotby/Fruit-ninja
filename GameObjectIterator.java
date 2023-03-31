package javaapplication3;

public class GameObjectIterator implements Iterator<GameObject> {

    private GameObject[] gameObjects;
    private int position;

    public GameObjectIterator(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
        position = 0;
    }

    @Override
    public GameObject next() {
        return gameObjects[position++];
    }

    @Override
    public GameObject currentItem() {
        return gameObjects[position];
    }

    @Override
    public boolean hasNext() {
        if (position >= gameObjects.length) {
            return false;
        }
        return true;
    }

    @Override
    public void reset() {
        this.position = 0;
 }
   
}
