package javaapplication3;

import javax.swing.ImageIcon;

public class Banana implements GameObject {

    private boolean movingUp = true;
    private boolean movedoffScreen = false;
    private String name = "banana";
    private boolean sliced = false;
    private int x, y;
    private int initialvelocity = 23;
    private int fallingvelocity = 15;
     boolean enter = false;

    public boolean isMovingUp() {
        return movingUp;
    }

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
        ImageIcon i = new ImageIcon("specialbanana.png");
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

    @Override
    public boolean hasMovedOffScreen() {
        return movedoffScreen;
    }

    @Override
    public void setMovedOff(boolean moved) {
        this.movedoffScreen = moved;
    }

    @Override
    public ImageIcon getSlicedImage() {
        ImageIcon i = new ImageIcon("cutbanana87.png");//path 
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
