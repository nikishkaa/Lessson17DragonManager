package by.itstep.goutor.javalesson.lesson17.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson17.task.task1.model.data.Dragon;

public class DragonManager {
    private static final int FIRST_PERIOD = 200;
    private static final int SECOND_PERIOD = 300;
    private static final int BORN_HEADS = 3;
    private static final int FIRST_HEAD = 3;
    private static final int SECOND_HEAD = 2;


    public static int countHeads(Dragon dragon) {
        if (dragon == null || dragon.getName().equals("no name")) {
            return 0;
        }

        int head = BORN_HEADS;

        if (dragon.getAge() < FIRST_PERIOD) {
            head += dragon.getAge() * FIRST_HEAD;
        } else if (dragon.getAge() < SECOND_PERIOD) {
            head += FIRST_PERIOD * FIRST_HEAD + (dragon.getAge() - FIRST_PERIOD)
                    * SECOND_HEAD;
        } else {
            head += FIRST_PERIOD * FIRST_HEAD + (SECOND_PERIOD - FIRST_PERIOD)
                    * 2 - SECOND_PERIOD + dragon.getAge();
        }

        return head;
    }
}
