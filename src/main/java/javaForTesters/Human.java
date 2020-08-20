package javaForTesters;

public class Human implements Actions {
    private String name;
    private int runningDistance;
    private int jumpHeight;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runningDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        //System.out.println("Человек " + this.name + " бег " + this.getRunningDistance());
        //TODO: Бег человека.
    }

    @Override
    public void jump() {

       // System.out.println("Человек " + this.name + " прыжок " + this.getJumpHeight());
        //TODO: Прыжок человека.
    }

    @Override
    public int getRunningDistance() {
        return this.runningDistance;
    }

    @Override
    public int getJumpHeight() {

        return this.jumpHeight;
    }

}