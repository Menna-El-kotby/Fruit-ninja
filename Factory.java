package javaapplication3;

public class Factory {

    public GameObject getObject(String objectName) {
        if (objectName.equals("apple")) {
            return new Apple();
        } else if (objectName.equals("banana")) {

            return new Banana();
        } else if (objectName.equals("watermelon")) {
            return new WaterMelon();
        } else if (objectName.equals("orange")) {
            return new Orange();
        } else if (objectName.equals("bomb")) {
            return new Bomb();

        } else if (objectName.equals("pineapple")) {
            return new Pineapple();
        } else if (objectName.equals("fatal bomb")) {
            return new FatalBomb();
        } else if (objectName.equals("pome")){
            return new Pomegranate();
        }
        else
        {
              return new DragonFruit();
        }

    }
}
