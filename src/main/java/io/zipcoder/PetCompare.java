package io.zipcoder;

import io.zipcoder.Pets.Pet;

import java.util.Comparator;

public class PetCompare implements Comparator<Pet> {
    @Override
    public int compare(Pet o1, Pet o2) {
        int compareName = o1.getName().compareTo(o2.getName());
        int compareType = o1.getType().compareTo(o2.getType());

        return (compareType == 0) ? compareName : compareType;
    }
}
