package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Input 
{
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));   
    
    public static int Active(int max) throws IOException
    {
        int a;
        try 
        {
            a = Integer.parseInt(Input.in.readLine());
            if(a > max || a <= 0)
            {
                System.out.print("You entered incorrectly! Please re-enter: ");
                a = Active(7);                
            }
            
        } catch (Exception e) 
        {
            System.out.print("You entered incorrectly! Please re-enter: ");
            a = Active(7);
        }
        return a;
    }    
    
    public static String Id() throws IOException
    {
        return in.readLine();
    }    
    
    public static String Name() throws IOException
    {
        return in.readLine();
    }     
    
    public static String ngheNghiep() throws IOException
    {

    	 System.out.println("1 : Giáo Viên.");
         System.out.println("2 : Ngân Hàng ");
    	 int a = Input.Active(2);
    	 String result = null;
         switch(a)
         {
             case 1 :
             {
            	  result = "Giáo Viên";  break;} 
             case 2 :
             {
            	  result = "Ngân Hàng"; break;}       
         }     
         return result;
    }     
    
    public static String chucVu() throws IOException
    {

    	  return in.readLine();
    }    
    
    public static String email() throws IOException
    {

    	 return in.readLine();
    	 
    }     
    
    public static String addRess() throws IOException
    {

    	  return in.readLine();
    }     
    
    
    
    public static String Phone() throws IOException
    {        
        String str = in.readLine();
        if(str.length() < 10 || str.length() > 11)
        {
            System.out.print("Số điện thoại không hợp lệ ! Yêu cầu nhập lại : ");
            str = Phone();
        }
        else
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(!"0123456789".contains(str.charAt(i) + ""))
                {
                    System.out.print("Số điện thoại không hợp lệ ! Yêu cầu nhập lại : ");
                    str = Phone();
                    break;
                }
            }
        }
        return str;
    }     
    
}
