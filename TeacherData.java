package School_Management_System;

public class TeacherData 
{

	String name;
	String subject;
	Double salary;

	public TeacherData(String name, String subject, Double salary)
	{
		// TODO Auto-generated constructor stub
	
	 this.name=name;
     this.subject=subject;
     this.salary=salary;
	}

	
  public String setName() {
      return name;
  }
  
  public String getName() {
      return name;
  }
  
  public String setSubject() {
      return subject;
  }
  
  public String getSubject() {
      return subject;
  }
    
  public Double setSalary() {
      return salary;
  }
  
  public Double getSalary() {
      return salary;
  }
  
  
  @Override
  public String toString() {
      return "Teacher Name :  "+name+"\n Subject Name:   "+subject+"\n Teacher Salary:  "+salary;
              
  }
  
}