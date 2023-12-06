package io.zipcoder;

import io.zipcoder.Pets.Bird;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void testSpeak(){

        Bird bird = new Bird();
        String expected = "chirp";
        String actual = bird.speak();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testPet() {
        Bird bird = new Bird();

        Assert.assertTrue(bird instanceof Pet);

    }
}
