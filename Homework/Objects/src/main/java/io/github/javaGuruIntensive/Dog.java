package io.github.javaGuruIntensive;

import java.util.function.DoubleFunction;

public class Dog {
   public int age;
   public String color;
   public String name;

  public  Dog(String name, String color, int age){
      this.name =name;
      this.color=color;
      this.age=age;
  }
//  Dog dog = new Dog("Barsik","brown",11);
   void voice(){
       System.out.println("Bark-bark");}
   void eat(){
       System.out.println("Consumes food");
   }
   void sleep(){
       System.out.println("Going on your couch");

   }
}
