package io.zipcoder;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PetConsole {

    private PrintStream output;
    private Scanner input;

    public PetConsole() {
        this(System.in, System.out);
    }

    public PetConsole(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
    }

    public void println(String str) {
        output.format(str + "\n");
    }

    public String getInputString(String str) {
        println(str);
        return input.nextLine();
    }

    public Integer getInputNumber(String str) {
        String input = getInputString(str);
        Integer input1 = Integer.parseInt(input);

        return input1;
    }
}
