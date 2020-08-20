package javaForTesters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat testCat = new Cat("Мурка", 12, 16);

    @Test
    void run() {
        testCat.run();
    }

    @Test
    void jump() {
        testCat.jump();
    }

    @Test
    void getRunningDistance() {
    }

    @Test
    void getJumpHeight() {
    }
}