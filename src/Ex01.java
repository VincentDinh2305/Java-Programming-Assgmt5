import java.util.*;

public class Ex01
{
   public static void main(String[] args)
   {
   List<String> list=new ArrayList<String>();
  
   list.add("Hearts");
   list.add("Diamonds");
   list.add("Clubs");
   list.add("Spades");
     
   System.out.println("The list before sorting is: ");
   System.out.println(list);
  
   Collections.sort(list);  
   System.out.println("The list after sorting is: ");
   System.out.println(list);
   }
}