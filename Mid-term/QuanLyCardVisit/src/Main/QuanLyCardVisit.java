package Main;

import Controller.Check_IND;
import Controller.Input;
import Controller.SaveFile;
import Controller.Index;
import Model.CardVisit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class QuanLyCardVisit 
{    
    public static ArrayList<CardVisit> arr = new ArrayList<>();
    
    public static void Start() throws IOException, FileNotFoundException, ClassNotFoundException
    {         
    	System.out.println("		-MENU-		");
        System.out.println("1 : Show List Card Visit.");
        System.out.println("2 : Thêm Card Visit Mới ");
        System.out.println("3 : Xóa  Card Visit.");
        System.out.println("4 : Chỉnh Sửa Card Visit.");
        System.out.println("5 : Tìm Kiếm Card Visit.");
        System.out.println("6 : Xuất Card Visit Vào File.");
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
        System.out.println("-------------------------------------------------");
        if(arr.isEmpty())
        {
            System.out.println("List Card Rỗng!");
        }
        else
        {
            for(int i = 0; i < arr.size(); i++)
            {           
                Print_Inf(arr.get(i));                
            }
        }
        System.out.println("-------------------------------------------------");        
        Start();
    }
    
    public static void Add() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        System.out.println("-------------------------------------------------");
// Input      
        String id = Integer.toString(arr.size()+1);
        System.out.print("-) Nhập Tên Card Visit Mới ");
        String name = Input.Name();
        System.out.print("-) Chọn nghề nghiệp ");
        System.out.println();
        String job = Input.ngheNghiep();
        System.out.print("-) Chức vụ : ");
        String chucVu = Input.chucVu();
        System.out.print("-) Nhập Số Điện Thoại : ");
        String phone = Input.Phone();   
        if(!Check_IND.Phone(phone))
        {
            System.out.print("Số Điện Thoại Này Đã Tồn Tại Trong Hệ Thống! Yêu Cầu Nhập Lại :");
            phone = Input.Phone();  
        }     
        System.out.print("-) Nhập Email : ");
        String email = Input.email();
        if(!Check_IND.Email(email))
        {
            System.out.print("Email không hợp lệ yêu cầu nhập lại :");
            email = Input.email();  
        }     
        System.out.print("-) Nhập địa chỉ : ");
        String address = Input.addRess();
        
        
// Creat new Card by input information        
        CardVisit kh = new CardVisit(id, name, job, chucVu, phone, email, address);
// Add to list        
        arr.add(kh);
// Save        
        System.out.println("[Thêm Card Visit Thành Công : ]");
        //Save();
        System.out.println("-------------------------------------------------");        
        Start();
    }
            
    public static void Save() throws IOException
    {
        SaveFile.Output(); 
        System.out.println("[Xuất List Card Vào File Thành Công!]");
        
    }
    
    public static void Print_Inf(CardVisit kh)
    {
        System.out.println("ID: " + kh.getId() + " Name: " + kh.getName());
        System.out.println("Nghề Nghiệp: " + kh.getNgheNghiep());
        System.out.println("Chức vụ : " + kh.getChucVu());
        System.out.println("Phone number: " + kh.getPhone());
        System.out.println("Email: " + kh.getEmail());
        System.out.println("AddRess : " + kh.getAddress());
        System.out.println();
    }
    
    public static void Delete() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        System.out.println("-------------------------------------------------");
// Input        
        System.out.print("Nhập ID Card Visit Muốn Xóa : ");
        String id = Input.Id();
        while(Check_IND.Id(id))
        {
            System.out.print("ID Liên Lạc Không Tồn Tại! Yêu Cầu Nhập Lại : ");
            id = Input.Id();
        }
// Delete        
        for(int i = 0; i < arr.size(); i++)
        {
            if(id.equals(arr.get(i).getId()))
            {
                arr.remove(i);
                break;
            }
        }
        for(int i = 0; i < arr.size(); i++)
        {
           arr.get(i).setId(Integer.toString(i+1));
        }
// Save        
        System.out.println("[Xóa Card Visit Thành Công!]");
      //  Save();
        System.out.println("-------------------------------------------------");            
        Start();
    }
    
    public static void Change_Infomatino() throws IOException, FileNotFoundException, ClassNotFoundException
    {
// Input         
        System.out.println("-------------------------------------------------");
        System.out.print("Nhập ID Card Muốn Chỉnh Sửa : ");
        String id = Input.Id();
        while(Check_IND.Id(id))
        {
            System.out.print("ID Card Không Tồn Tại! Yêu Cầu Nhập Lại:");
            id = Input.Id();
        }   
        int location = Index.by_Id(id);
        System.out.println("1: Sửa Tên : " + arr.get(location).getName());
        System.out.println("2: Sửa Nghề Nghiệp : " + arr.get(location).getNgheNghiep());
        System.out.println("3: Sửa Chức Vụ : " + arr.get(location).getChucVu());
        System.out.println("4: Sửa SĐT : " + arr.get(location).getPhone());
        System.out.println("5: Sửa Email : " + arr.get(location).getEmail());
        System.out.println("6: Sửa Địa Chỉ : " + arr.get(location).getAddress());
        System.out.print(" Bạn muốn chỉnh sửa : ");        
// Change
        switch(Input.Active(2))
        {
            case 1 :
            {
                System.out.print("Nhập Tên Mới Cho Card Visit : ");
                arr.get(location).setName(Input.Name());
                break;
            }
            case 2 :
            {
                System.out.print("Chọn lại nghề nghiệp: ");
                arr.get(location).setNgheNghiep(Input.ngheNghiep());
                break;
            }
            case 3 :
            {
                System.out.print("Nhập Chức Vụ Mới : ");
                arr.get(location).setChucVu(Input.chucVu());
                break;
            }
            case 5 :
            {
                System.out.print("Nhập Email Mới : ");
                arr.get(location).setEmail(Input.email());
                break;
            }
            case 4 :
            {
                System.out.print("Nhập Số Điện Thoại Mới Cho Liên Lạc");
                arr.get(location).setPhone(Input.Phone());
                break;
            }      
            case 6 :
            {
                System.out.print("Nhập Địa Chỉ Mới : ");
                arr.get(location).setAddress(Input.addRess());
                break;
            }
        }
// Save        
        //Save();
        System.out.println("-----------Chỉnh Sửa Thành Công !!!------------------");  
        System.out.println("-------------------------------------------------");        
        Start();
    }
    
    public static void Find() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        
//  Var
        int location;
// Input and Find
        System.out.println("-------------------------------------------------");        
        System.out.println("1: Tên Liên lạc");
        System.out.println("2: Nghề Nghiệp");
        System.out.println("3: Chức Vụ");        
        System.out.print("Lựa chọn tìm kiếm theo :");        
        switch(Input.Active(3))
        {
            case 1: 
            {
            	 location = Index.by_Name(Input.Name());
                 if(location != -1)
                 {
                     System.out.println("");                    
                     Print_Inf(arr.get(location));                    
                 }
                 else
                 {
                     System.out.println("[Không Có Liên Lạc Trong Hệ Thống!]");
                 }
                 
                 break;
            }
            case 2: 
            {
            	System.out.println("Chọn Nghề Nghiệp Cần Tìm Kiếm :");          
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
                
                location = Index.by_nN(result);
                if(location != -1)
                	
                {
                	System.out.println("List Card Visit Có Nghề Nghiệp "+ result + " là : ");
                    for (int  i = 0; i<arr.size(); i++)
                    {
                    	if (arr.get(i).getNgheNghiep()==result)
                    	{
                    		Print_Inf(arr.get(i));
                    		System.out.println();
                    	}
                    }
                }
                else
                {
                    System.out.println("Không tồn tại Card Visit có nghề nghiệp " + result + " trong hệ thống !");
                }
                break;
            }
            case 3: 
            {
                System.out.print("Nhập Chức Vụ Cần Tìm Kiếm : ");
                String tmp = Input.chucVu();
                location = Index.by_CVu(tmp);
                if(location != -1)
                {
                	System.out.println("List Card Visit Có Chức Vụ "+ tmp + " là : ");
                	 for (int  i = 0; i<arr.size(); i++)
                     {
                     	if (arr.get(i).getChucVu()==tmp)
                     	{
                     		Print_Inf(arr.get(i));
                     		System.out.println();
                     	}
                     }
                }
                else
                {
                    System.out.println("[Không Có Card Visit Của Chức Vụ Này Trong Hệ Thống!]");
                }
                break;
            }            
        }
        System.out.println("-------------------------------------------------");        
        Start();
    }
    
    public static void Output_File() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        System.out.println("-------------------------------------------------");         
        SaveFile.Output_Text();
        System.out.println("[Lưu Thành Công!]");
        System.out.println("[File Danh Bạ Nằm Ở Desktop]");
        System.out.println("-------------------------------------------------");    
        Start();
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException 
    {
      //  File_Factory.Input();         
        Start();
    }
    
    
}
