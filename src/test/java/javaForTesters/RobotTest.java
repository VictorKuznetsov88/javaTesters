package javaForTesters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Robot testRobot = new Robot("Чаппи",2,15);

    @Test
    public void run() {
        testRobot.run();
    }

    @Test
    public void jump() {
        testRobot.jump();
    }

    @Test
    void getRunningDistance() {
    }

    @Test
    void getJumpHeight() {
    }
}