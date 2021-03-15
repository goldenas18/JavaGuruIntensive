package io.github.javaGuruIntensive;

public class DogDemo {
    public static void main(String[] args) {
        var dog =new Dog("navi","wight",2);
        dog.sleep();
        dog.eat();
        dog.voice();
        System.out.println(dog.toString());
        System.out.println(dog.age);
    }

}
