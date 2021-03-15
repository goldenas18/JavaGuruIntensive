package io.github.javaGuruIntensive;

import java.util.logging.Logger;

public class LampDemo {

    public static void main(String[] args) {
        Lamp lampOne = new Lamp();
        Lamp lampTwo = new Lamp();

        System.out.println("LampOne is on = "+ lampOne.isOn);
        System.out.println("LampTwo is on = "+ lampTwo.isOn);
        lampOne.turnOn();
        System.out.println("LampOne is on = "+ lampOne.isOn);
        lampTwo.turnOn();
        lampOne.turnOff();
        System.out.println("LampOne is on = "+ lampOne.isOn);
        System.out.println("LampTwo is on = "+ lampTwo.isOn);



    }
}
