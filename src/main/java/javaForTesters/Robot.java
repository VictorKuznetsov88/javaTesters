package javaForTesters;

public class Robot implements Actions {
    private String name;
    private int runningDistance;
    private int jumpHeight;

    public Robot(String name, int distance, int jumpHeight) {
       this.name = name;
       this.runningDistance = distance;
       this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        //System.out.println("Робот " + this.name + " бег " + this.getRunningDistance());
        //TODO : Бег робота.
    }

    @Override
    public void jump() {
        //System.out.println("Робот " + this.name + " прыжок " + this.getJumpHeight());
        //TODO : Прыжок робота.
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