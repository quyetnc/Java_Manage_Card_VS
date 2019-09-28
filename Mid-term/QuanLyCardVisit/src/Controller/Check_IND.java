package Controller;

import static Main.QuanLyCardVisit.arr;
public class Check_IND 
{
    public static Boolean Id(String str)
    {
        Boolean output = true;
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).getId().equals(str))
            {
                output = false;
                break;
            }
        }    
        return output;        
    }
    
    public static Boolean Phone(String str)
    {
        Boolean output = true;
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).getName().equals(str))
            {
                output = false;
                break;
            }
        }
        return output;
    }    
    public static Boolean Email(String str)
    {
        Boolean output = null;
        String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (str.matches(pattern))
        {
        	output=true;
        }
        else output = false;
        return output;
    } 
}
