package io.zipcoder;

public class Dog extends Pet{

    public Dog(){
        super();
        super.setType("dog");
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
