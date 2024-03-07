package by.itstep.goutor.javalesson.lesson17.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson17.task.task1.model.data.Dragon;
import org.junit.Assert;
import org.junit.Test;

public class DragonManagerTest {
    @Test
    public void DragonManagerTest() {

        Dragon dragon = new Dragon("A", 100);

        int expected = 303;

        int actual = DragonManager.countHeads(dragon);


        if (actual != expected) {
            Assert.fail();
        }

    }
}
