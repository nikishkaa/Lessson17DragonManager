package by.itstep.goutor.javalesson.lesson17.task.task1.controller;

import by.itstep.goutor.javalesson.lesson17.task.task1.model.data.Dragon;
import by.itstep.goutor.javalesson.lesson17.task.task1.model.logic.DragonManager;
import by.itstep.goutor.javalesson.lesson17.task.task1.util.DragonUI;
import by.itstep.goutor.javalesson.lesson17.task.task1.view.Printer;

public class Main {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon("A",100);

        Dragon dragon2 = new Dragon("B",400);

        int head1 = DragonManager.countHeads(dragon1);
        int head2 = DragonManager.countHeads(dragon2);


        Printer.print(dragon1 + "\n");
        Printer.print(dragon2 + "\n");
        Printer.print(dragon1.name + ": age = " + dragon1.age + " head " + head1 + "\n");
        Printer.print(dragon2.name + ": age = " + dragon2.age + " head " + head2 + "\n");


    }
}
