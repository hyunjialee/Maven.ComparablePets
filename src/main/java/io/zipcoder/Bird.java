package io.zipcoder;

public class Bird extends Pet{

    public Bird(){
        super();
        super.setType("bird");
    }

    public Bird(String name){
        super(name);
        super.setType("bird");
    }
    @Override
    public String speak() {
        return "chirp";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
