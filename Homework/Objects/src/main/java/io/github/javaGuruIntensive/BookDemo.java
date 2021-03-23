package io.github.javaGuruIntensive;

public class BookDemo {
    public static void main(String[] args) {
        Book javaBook = new Book("thinking in Java", "Mike");
        javaBook.printInformation();
        javaBook.title = "Thinking in Java";
        javaBook.publisher = "Mike";
        javaBook.isbn = "353626";
        javaBook.pageCount = 1033;


        System.out.println("javaBook title "+ javaBook.title);
        System.out.println("javaBook publisher "+ javaBook.publisher);
        System.out.println("javaBook ISBN "+javaBook.isbn);
        System.out.println("javaBook pageCount "+javaBook.pageCount);

   }
    }


