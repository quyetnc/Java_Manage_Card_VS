package Model;

import java.io.Serializable;

public class CardVisit {
	 	private String id;    
	    private String name;
	    private String phone;
	    private String ngheNghiep;
	    private String email;
	    private String chucVu;
	    private String addRess;



	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;                
	    }

	    public String getNgheNghiep()
	    {
	    	return ngheNghiep;
	    }
	    
	    public void setNgheNghiep(String job) {
	        this.ngheNghiep = job;                
	    }
	    
	    public String getEmail()
	    {
	    	return email;
	    }
	    
	    public void setEmail(String emaill) {
	        this.email = emaill;                
	    }
	    
	    public String getChucVu()
	    {
	    	return chucVu;
	    }
	    
	    public void setChucVu(String cV) {
	        this.chucVu = cV;                
	    }
	    
	    public String getAddress()
	    {
	    	return addRess;
	    }
	    public void setAddress(String dC) {
	        this.addRess = dC;                
	    }
	    
	    public CardVisit() 
	    {
	        
	    }

	    public CardVisit(String id, String name, String job, String chucVu, String phone, String email, String address ) 
	    {
	        this.id = id;
	        this.name = name;
	        this.ngheNghiep = job;
	        this.chucVu = chucVu;
	        this.phone = phone;
	        this.email = email;
	        this.addRess = address;
	    }

	    @Override
	    public String toString() 
	    {                                                               
	        return this.id + "_" + this.name + "_" + this.ngheNghiep + "_" + this.chucVu + "_" + this.phone+ "_" + this.email+ "_" + this.addRess;
	    }           

}
