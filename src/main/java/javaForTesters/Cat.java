package javaForTesters;

public class Cat implements Actions {
    private String name;
    private int runningDistance;
    private int jumpHeight;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runningDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {

        //System.out.println("Кошка " + this.name + " бег " + this.getRunningDistance());
        //TODO : Бег кошки.
    }

    @Override
    public void jump() {

        //System.out.println("Кошка " + this.name + " прыжок " + this.getJumpHeight());
        //TODO : Прыжок кошки.
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
