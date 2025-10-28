import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    uprightNumberTriangle(50);
  }

  public static void printNTimes(String word, int N)
  {
    // code solution here
  }

  public static void printNums()
  {
    for( int i = 1; i <= 10; i++)
    {
      for(int j = 1; j <= i; j++)
      {
        System.out.print(i +" ");
      }
      System.out.println(" ");
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for(int i = 1; i <= N; i++)
    {
      for(int j = 1; j <= i ; j++)
      {
        System.out.print(j +" ");
      }
      System.out.println(" ");
    }




  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
