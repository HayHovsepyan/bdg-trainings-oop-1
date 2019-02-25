package com.bdg.aghazaryan.src.aghazaryan.src.interfacehomework.movable;

public class  MovableCircle extends MovablePoint implements Movable  {
    private int radius;
    private MovablePoint center;

    public MovableCircle (int x, int y, int xSpeed, int ySpeed,int radius)  {
        super(ySpeed, xSpeed, y, x);
        center =  new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;

    }

    public String toString() {
        return "MovableCircle [radius=" + radius + ", center=" + center + "]";
    }

    public void moveUp()
    {
        center.y -= center.ySpeed;
    }

    public void moveDown()
    {
        center.y += center.ySpeed;
    }


    public void moveLeft() {

        center.x -= center.xSpeed;
    }


    public void moveRight() {

        center.x += center.xSpeed;
    }
    public static void main(String args[]) {
        MovableCircle moveCirc = new MovableCircle(5, 6, 8, 9, 8);
        System.out.println("moveCirc.moveUp(2)");
        moveCirc.moveUp();
        System.out.println("moveCirc.moveDown(2)");
        moveCirc.moveDown();
        System.out.println("moveCirc.moveLeft(5)");
        moveCirc.moveLeft();
        System.out.println("moveCirc.moveRight(5)");
        moveCirc.moveRight();

    }
}