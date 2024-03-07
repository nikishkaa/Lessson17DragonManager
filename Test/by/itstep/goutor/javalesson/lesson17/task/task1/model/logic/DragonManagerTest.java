package by.itstep.goutor.javalesson.lesson17.task.task1.model.logic;

import by.itstep.goutor.javalesson.lesson17.task.task1.model.data.Dragon;
import org.junit.After;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonManagerTest {

    private Dragon dragon;

    @Before
    public void init() {
        dragon = new Dragon();
        dragon.setName("Gorinich");

    }

    @After
    public void destroy() {
        dragon = null;
    }

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


    @Test
    public void testCountHeadsBySecondPeriod() {

        // Arrange
        Dragon dragon = new Dragon("Gorinich", 250);

        int expected = 703;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsByThirdPeriod() {

        // Arrange
        Dragon dragon = new Dragon("Gorinich", 350);

        int expected = 853;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsByAge200() {

        // Arrange
        Dragon dragon = new Dragon("Gorinich", 200);

        int expected = 603;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsByAge201() {

        // Arrange
        Dragon dragon = new Dragon("Gorinich", 201);

        int expected = 605;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsByAge300() {

        // Arrange
        Dragon dragon = new Dragon("Gorinich", 300);

        int expected = 803;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsByAge301() {

        // Arrange
        Dragon dragon = new Dragon("Gorinich", 301);

        int expected = 804;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsByDragonNull() {

        // Arrange
        Dragon dragon = null;

        int expected = 0;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountHeadsBySecondPeriod1() {

        dragon.setAge(250);
        int expected = 703;

        // Act
        int actual = DragonManager.countHeads(dragon);

        // Assert
        assertEquals(expected, actual);
    }


}
