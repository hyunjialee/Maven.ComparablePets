package io.zipcoder;


import io.zipcoder.Pets.*;

import java.util.ArrayList;
import java.util.List;

public class Application implements Runnable{

    private PetConsole console = new PetConsole();
    private List<Pet> petList = new ArrayList<>();
    @Override
    public void run() {
        int setPetNumber = console.getInputNumber("How many pets do you have?");

        for (int i = 0; i < setPetNumber; i++) {
            String petType = console.getInputString("What type of pet is number " + (i+1) + "? \n [ bird ] [ cat ] [ dog ] [ monkey ]");
            String petName = console.getInputString("What is the pet name?");

            petList.add(i, create(petName, petType));
        }

        String allPets = "";
        for (int i = 0; i < petList.size(); i++) {

            allPets += petList.get(i).getName()
                    + " is making noises: "
                    + petList.get(i).speak() + " "
                    + petList.get(i).speak() + "\n";
        }
        System.out.println(allPets);
    }

    public Pet create(String name, String type){
        if(type.equalsIgnoreCase("bird")) {
            return new Bird(name);
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat(name);
        } else if (type.equalsIgnoreCase("dog")) {
            return new Dog(name);
        } else if (type.equalsIgnoreCase("monkey")){
            return new Monkey(name);
        }
        return null;
    }
}
