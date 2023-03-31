package javaapplication3;

import java.util.ArrayList;

public class CareTaker {

    private ArrayList<Memento> mementos = new ArrayList<>();
    private static CareTaker instance = new CareTaker();

    private CareTaker() {
    }

  public static CareTaker getInstance() {
        return instance;
    }

    public void addMemento(Memento m) {
        mementos.add(m);

    }

    public ArrayList<Memento> getMementos() {
        return mementos;
    }

    public void setMementos(ArrayList<Memento> mementos) {
        this.mementos = mementos;
    }

    public Memento getMemento(int i) {
        return mementos.get(i);
    }

}
