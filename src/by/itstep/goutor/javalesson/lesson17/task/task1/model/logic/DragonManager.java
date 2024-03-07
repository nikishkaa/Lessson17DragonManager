package by.itstep.goutor.javalesson.lesson17.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson17.task.task1.model.data.Dragon;

public class DragonManager {
    public static final int FIRST_PERIOD = 200;
    public static final int SECOND_PERIOD = 300;
    public static final int BORN_HEADS = 3;
    public static final int FIRST_HEAD = 3;
    public static final int SECOND_HEAD = 2;


    public static int countHeads(Dragon dragon) {
        int head = BORN_HEADS;

        if (dragon.age < FIRST_PERIOD) {
            head += dragon.age * FIRST_HEAD;
        } else if (dragon.age < SECOND_PERIOD) {
            head += FIRST_PERIOD * FIRST_HEAD + (dragon.age - FIRST_PERIOD)
                    * SECOND_HEAD;
        } else {
            head += FIRST_PERIOD * FIRST_HEAD + (SECOND_PERIOD - FIRST_PERIOD)
                    * 2 - SECOND_PERIOD + dragon.age;
        }

        return head;
    }
}
