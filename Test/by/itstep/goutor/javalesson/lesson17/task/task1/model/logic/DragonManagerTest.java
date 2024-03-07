package by.itstep.goutor.javalesson.lesson17.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson17.task.task1.model.data.Dragon;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonManagerTest {
    @Test
    public void testCountHeadsByFirstPeriod() {

        // Arrange
        Dragon dragon = new Dragon("Gorinich", 100);

        int expected = 303;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }
}
