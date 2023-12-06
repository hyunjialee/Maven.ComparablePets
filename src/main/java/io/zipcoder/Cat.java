package io.zipcoder;

public class Cat extends Pet {

    public Cat(){
        super();
        super.setType("cat");
    }

    public Cat(String name) {
        super(name);
        super.setType("cat");
    }
    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
