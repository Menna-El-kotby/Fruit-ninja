
package javaapplication3;


public class GameObjectList implements List<GameObject>{
    private GameObject[] gameObjects;
     
    public GameObjectList(GameObject[] gameObjects)
    {
        this.gameObjects = gameObjects;
    }
     
    @Override
    public Iterator<GameObject> iterator() {
        return new GameObjectIterator(gameObjects);
    }
    
    
}
