package Controller;

import static Main.QuanLyDanhBa.arr;
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
}
