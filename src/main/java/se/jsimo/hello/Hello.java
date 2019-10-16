package se.jsimo.hello;

public class Hello {
  private static String helloString = "Hello world!";

  public static void main(String[] args) {
    System.out.println(helloString);
  }

  public static String getHelloString() {
    return helloString;
  }
}
