package io.github.javaGuruIntensive;

public class Book {
  public String title;
  public String publisher;
  public String isbn;
  public int pageCount;

  public Book(String title,String publisher){
      this.title=title;
      this.publisher=publisher;
  }
public void printInformation(){
    System.out.println("javaBook title "+ this.title);
    System.out.println("javaBook publisher "+ this.publisher);
    System.out.println("javaBook ISBN "+this.isbn);
    System.out.println("javaBook pageCount "+this.pageCount);
}
}
