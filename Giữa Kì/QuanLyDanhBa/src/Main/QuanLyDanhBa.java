package Main;

import Controller.Check_IND;
import Controller.Input;
import Controller.SaveFile;
import Controller.Index;
import Model.LienLac;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class QuanLyDanhBa 
{    
    public static ArrayList<LienLac> arr = new ArrayList<>();
    
    public static void Start() throws IOException, FileNotFoundException, ClassNotFoundException
    {         
    	System.out.println("		-MENU-		");
        System.out.println("1 : Show Danh Bạ.");
        System.out.println("2 : Thêm Liên Lạc Mới Vào Danh Bạ.");
        System.out.println("3 : Xóa Liên Lạc.");
        System.out.println("4 : Chỉnh Sửa Liên Lạc.");
        System.out.println("5 : Tìm Kiếm Liên Lạc.");
        System.out.println("6 : Lưu Danh Bạ Vào File.");
        System.out.println("7 : Thoát.");
        System.out.print("Lựa chọn của bạn : ");
        int a = Input.Active(7);
        switch(a)
        {
            case 1 : {Show_All(); break;} 
            case 2 : {Add(); break;} 
            case 3 : {Delete(); break;}
            case 4 : {Change_Infomatino(); break;}
            case 5 : {Find(); break;}
            case 6 : {Output_File(); break;}
        }     
    }

    public static void Show_All() throws IOException, FileNotFoundException, ClassNotFoundException
    {
      
    }
    
    public static void Add() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        
    }
            
    public static void Save() throws IOException
    {

        
    }
    
    public static void Print_Inf(LienLac lL)
    {
        System.out.println("ID: " + lL.getId());
        System.out.println("Name: " + lL.getName());
        System.out.println("Phone number: " + lL.getPhone());
        System.out.println();
    }
    
    public static void Delete() throws IOException, FileNotFoundException, ClassNotFoundException
    {
    }
    
    public static void Change_Infomatino() throws IOException, FileNotFoundException, ClassNotFoundException
    {
    }
    
    public static void Find() throws IOException, FileNotFoundException, ClassNotFoundException
    {
      
    }
    
    public static void Output_File() throws IOException, FileNotFoundException, ClassNotFoundException
    {
    	
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException 
    {
       // SaveFile.Input();         
        Start();
    }
    
}
