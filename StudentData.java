package School_Management_System;

public class StudentData {

	
	  String name;
	  int id;
	  String gender;
	  
	  public StudentData(String name, int id, String gender) {
		// TODO Auto-generated constructor stub
	
	   	
		 this.name=name;
	     this.id=id;
	     this.gender=gender;
	  }

	  	public int setId() {
	        return id;
	    }
	  	
	  	 public int getId() {
		        return id;
		 }

	    public String setName() {
	        return name;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    
	    public String setGender() {
	        return gender;
	    }
	    
	    
	    public String getGender() {
	        return gender;
	    }
	    @Override
	    public String toString() {
	        return "Student's name :  "+name+"\n  Admission no.:   "+id+"\n  Gender:  "+gender;
	                
	    }
	    
	}