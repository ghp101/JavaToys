//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
            
	}

	public void loadToys( String toys )
	{
            toyList = new ArrayList<Toy>();
            
            Scanner input = new Scanner(toys);
            while(input.hasNext())
            {
                String s = input.next();
                boolean found = false;
                
                for(Toy i : toyList)
                {
                    if(i.getName().equals(s))
                    {
                        i.setCount(i.getCount() + 1);
                        found = true;
                    }
                }
                
              
                if(found == false)
                {
                    Toy t = new Toy(s);
                    toyList.add(t);
                    t.setCount(1);
                }
            }
	}
  
  	public Toy getThatToy( String nm )
  	{
            return toyList.get(toyList.indexOf(nm));
  	}
  
//  	public String getMostFrequentToy()
//  	{
//            return "";
//  	}  
//  
//  	public void sortToysByCount()
//  	{
//            
//  	}  
  	  
	public String toString()
	{
           String out = "";
           
           for(Toy i : toyList)
            {
                out = out + i.toString() + ", ";
            }
           
	   return out;
	}
}