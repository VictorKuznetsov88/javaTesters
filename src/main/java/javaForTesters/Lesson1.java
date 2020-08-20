package javaForTesters;

import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(5);
        int heigth = rand.nextInt(5);
        actions[0] = new Human("Олег", distance, heigth);

        distance = rand.nextInt(5);
        heigth = rand.nextInt(5);
        actions[1] = new Robot("Чаппи", distance, heigth);

        distance = rand.nextInt(5);
        heigth = rand.nextInt(5);
        actions[2] = new Cat("Мурка", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(5);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new RunningTrack("Беговая дорожка " + i, distance);
            } else {
                barriers[i] = new Wall("стена " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

        }
    }
}

