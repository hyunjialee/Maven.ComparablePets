package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testSpeak(){

        Dog dog = new Dog();
        String expected = "woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testPet() {
        Dog dog = new Dog();

        Assert.assertTrue(dog instanceof Pet);

    }
}
