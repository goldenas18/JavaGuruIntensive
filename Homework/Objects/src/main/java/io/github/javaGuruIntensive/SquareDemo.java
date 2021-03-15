package io.github.javaGuruIntensive;

public class SquareDemo {
    public static void main(String[] args) {
        var square = new Square();
        square.sideLength =2;
        int p1 =square.calculatePerimeter();
        System.out.println("P when sideLength is "+square.sideLength+"="+p1);

        square.sideLength=5;
        int p2 = square.calculatePerimeter();
        System.out.println("P when sideLength is "+square.sideLength+"="+p2);
    }
}
