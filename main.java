import java.util.*;

class Main {
  public static void main(String[] args) {
    askQuest();
  }

  public static void askQuest () 
  {
    String[] name = new String[5];
    int[] medal = new int[5];
    String[] sport = new String[5];
    String response;
    int medalQuant;
    Scanner scanner = new Scanner(System.in);

    for (int i=1; i<=5; i++) 
    {
      print("Name Olympians/Paralympian " + i +"?");
      response = scanner.nextLine();
      name[i-1] = response;
      System.out.println(Arrays.toString(name)); 

      print("How many medals did he/she win?");
      medalQuant = scanner.nextInt();
      medal[i-1] = medalQuant;
      System.out.println(Arrays.toString(medal));  
 
      print("What sport did he/she compete in?");
      response = scanner.nextLine();
      response = scanner.nextLine();
      sport[i-1] = response;
      System.out.println(Arrays.toString(sport));  

    }

    message(name, medal, sport);


  }

  public static void print (String x) 
  {
    System.out.println(x);
  }

  public static int average (int[] medal) {
    double calc = 0;
    int arrLen = medal.length;
    for (int i=0; i<arrLen; i++) {
      calc = calc + medal[i];
    }
    calc = calc / arrLen;
    int average = (int) calc;
    return average;

  }
  
  public static void message (String[] name,int[] medal, String[] sport)
  {
    int average = average(medal);
    print("Between them they won an average of " + average + " medals each. ");

    for (int i=0; i<=4; i++)
    {
      int counter = 4;
      counter = counter - i;
      print(sport[counter] + ", " + name[counter] + ", " + medal[counter]);
    }
  }

}
