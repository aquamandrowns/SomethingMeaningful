import java.io.IOException;

class Main
{
  public static void main(String[] args)
  {
    System.out.println("Would you like to play a game.");
    char a;
    try {
      a = (char)System.in.read();
    }
    catch (IOException e) {
      System.out.println("input error!");
    }
  }
}
