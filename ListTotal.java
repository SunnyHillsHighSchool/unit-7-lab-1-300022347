//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;


public class ListTotal
{
 
 public static int total( List<Integer> ray )
 {
  int totalNumber = 0;
  for(int i=0; i< ray.size(); i++) 
  {
    totalNumber += ray.get(i);
  }
  return totalNumber;
 }
}