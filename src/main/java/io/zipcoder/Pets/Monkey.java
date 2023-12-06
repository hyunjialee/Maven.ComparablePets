package io.zipcoder.Pets;

import io.zipcoder.Pets.Pet;

public class Monkey extends Pet {

    public Monkey(){
        super();
    }

    public Monkey(String name){
        super(name);
        super.setType("monkey");
    }
    @Override
    public String speak() {
        return "OOO OOOO AAA AAAA";
    }
    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
