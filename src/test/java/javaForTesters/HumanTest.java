package javaForTesters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human testHuman = new Human("Коля", 20, 35);


    @Test
    void run() {
        testHuman.run();
    }

    @Test
    void jump() {
        testHuman.jump();
    }

    @Test
    void getRunningDistance() {
    }

    @Test
    void getJumpHeight() {
    }
}