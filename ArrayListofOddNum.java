import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListofOddNum
{
public static void main(String[] args)
{
  Scanner scan = new Scanner(System.in);
  System.out.println("How big would you like your list?");
  int decision = scan.nextInt();
  
  ArrayList<Integer> Rando = new ArrayList<Integer>();
  for (int i = 1; i <= decision; i++)
  {
      int num = scan.nextInt();
      Rando.add(num);
  }
  System.out.println();
  System.out.println(Rando);
  
  
 if(decision==0) {
	 System.out.println("Error, try again"); 
	 }
 else {
  ArrayList<Integer> evens = Rando;
  for (int i = 0; i < evens.size(); i++)
  {      
    if (evens.get(i)%2 != 0) 
    {
        evens.remove(i);
       
    }    
  }
   
    
ArrayList<Integer> odds = Rando;
  for (int i = 0; i < odds.size(); i++)
  {      
    if (odds.get(i)%2 != 0) 
    {
        evens.remove(i);
    }    
  }
  System.out.println();
  System.out.println(odds);
  
  for(Integer number: Rando)
  {
      System.out.println();
      System.out.println("# of Odd Numbers: "+ odds.size());
      System.out.println();
      break;
  }
 
  System.out.println("List Without Evens: " + evens.remove(0));
  System.out.println();
  
  
}
}
}
