package by.itstep.goutor.javalesson.lesson17.task.task1.util;

import by.itstep.goutor.javalesson.lesson17.task.task1.model.data.Dragon;

import by.itstep.goutor.javalesson.lesson17.task.task1.model.logic.DragonManager;

public class DragonUI {
    public static String format(Dragon dragon) {

        return String.format("Dragon %s has %d heads.", dragon.getName());
    }


}
