package io.zipcoder.Pets;

public class Dog extends Pet {

    public Dog(){
        super();
    }

    public Dog(String name){
        super(name);
        super.setType("dog");
    }
    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
