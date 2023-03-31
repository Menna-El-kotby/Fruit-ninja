package javaapplication3;

import javax.swing.ImageIcon;

public interface GameObject {

    public String getName();

    public boolean isEntered();

    public void setEntered(boolean entered);

    public void setInitialVelocity(int initialvelocity);

    public void setFallinglVelocity(int fallingvelocity);

    public void slice();

    public boolean hasMovedOffScreen();

    public void setMovedOff(boolean moved);

    public boolean isMovingUp();

    public boolean isSliced();

    public void setMovingUp(boolean movingUp);

    public int getXLocation();

    public void setXLocation(int x);

    public int getYLocation();

    public int getInitialVelocity();

    public int getFallingVelocity();

    public void setYLocation(int y);

    public ImageIcon getBufferedImage();

    public ImageIcon getSlicedImage();

}
