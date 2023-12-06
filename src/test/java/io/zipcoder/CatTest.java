package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak(){

        Cat cat = new Cat();
        String expected = "meow";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testType(){

        Cat cat = new Cat();
        String expected = "cat";
        String actual = cat.getType();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testPet() {
        Cat cat = new Cat();

        Assert.assertTrue(cat instanceof Pet);

    }
}
