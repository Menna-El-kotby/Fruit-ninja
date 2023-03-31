package javaapplication3;

import javax.swing.ImageIcon;

public class Pineapple implements GameObject {

    private boolean movingUp = true;
    private boolean movedoffScreen = false;
    private String name = "pineapple";
    private boolean sliced = false;
    private int x, y;
    private int initialvelocity = 26;
    private int fallingvelocity = 12;
     boolean enter = false;

    @Override
    public boolean isMovingUp() {
        return movingUp;
    }

    @Override
    public void setMovingUp(boolean movingUp) {
        this.movingUp = movingUp;
    }

    @Override
    public void slice() {
        sliced = true;
    }

    @Override
    public int getXLocation() {
        return x;
    }

    @Override
    public void setXLocation(int x) {
        this.x = x;
    }

    @Override
    public int getYLocation() {
        return y;
    }

    @Override
    public void setYLocation(int y) {
        this.y = y;
    }

    @Override
    public ImageIcon getBufferedImage() {
        ImageIcon i = new ImageIcon("pineapple.png");//path 
        return i;
    }

    @Override
    public int getInitialVelocity() {
        return initialvelocity;
    }

    @Override
    public int getFallingVelocity() {
        return fallingvelocity;
    }

    @Override
    public boolean isSliced() {
        return sliced;
    }

    public boolean hasMovedOffScreen() {
        return movedoffScreen;
    }

    @Override
    public void setMovedOff(boolean moved) {
        this.movedoffScreen = moved;
    }

    @Override
    public ImageIcon getSlicedImage() {
        ImageIcon i = new ImageIcon("cut.png");//path 
        return i;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setInitialVelocity(int initialvelocity) {
        this.initialvelocity = initialvelocity;

    }

    @Override
    public void setFallinglVelocity(int fallingvelocity) {
        this.fallingvelocity = fallingvelocity;
    }
  @Override
    public boolean isEntered() {
      return enter;
    }

    @Override
    public void setEntered(boolean entered) {
      this.enter = entered;
    }
}
