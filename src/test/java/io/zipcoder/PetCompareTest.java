package io.zipcoder;

import io.zipcoder.Pets.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

public class PetCompareTest {
    private List<Pet> array;


    @Before
    public void setUp(){
        array = new ArrayList<>();
        Cat cat = new Cat("a");
        Cat cat1 = new Cat("b");

        Bird bird = new Bird("c");
        Bird bird1 = new Bird("d");

        Dog dog = new Dog("e");
        Dog dog1  = new Dog("f");

        array.add(cat);
        array.add(cat1);
        array.add(bird1);
        array.add(bird);
        array.add(dog);
        array.add(dog1);
    }

    @Test
    public void testCompare(){
        PetCompare petCompare = new PetCompare();
        String expected = "[a, b, c, d, e, f]";
        String actual = array.toString();

        array.sort(petCompare);


        Assert.assertEquals(expected,actual);
    }
}

