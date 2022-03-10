package School_Management_System;
	
import java.util.*;

public class MainDataC 
{


        	public static void main(String[] args)
        	
        	{
        		
        		// TODO Auto-generated method stub
        		
        		TeacherData hindi = new TeacherData("malathi",    "Hindi",    7000.00);
        		TeacherData telugu = new TeacherData("Ramani",    "Telugu",   6000.00);
        		TeacherData maths = new TeacherData("Prabhakar",  "maths",    9000.00);
        		TeacherData science = new TeacherData("ronak",    "science",    8000.00);

        	    
        	        List<TeacherData> teacherList = new ArrayList<>();
        	        
        	        teacherList.add(hindi);
        	        teacherList.add(telugu);
        	        teacherList.add(maths);
        	        teacherList.add(science);



        	        StudentData s1 = new StudentData("sonia",401, "Male");
        	        StudentData s2 = new StudentData("lucky",402, "Female");
        	        StudentData s3 = new StudentData("sohel",403, "Male");
        	        StudentData s4 = new StudentData("ramya",404, "feMale");

        	        
        	        List<StudentData> studentList = new ArrayList<>();

        	        studentList.add(s1);
        	        studentList.add(s2);
        	        studentList.add(s3);
					studentList.add(s4);

        	        
        	        
        	        
        				
        				Scanner scan=new Scanner(System.in);
        				int ch;
        				System.out.println("-----------------------------------------------------");
        				System.out.println("School Management System");
        				System.out.println("-----------------------------------------------------");

        				System.out.println("Teacher Data");
        				System.out.println("Student Data ");
        				System.out.println("Choose the option 1 or teacher data and 2 for student data");

        				ch=scan.nextInt();
        				
        				
        				switch(ch)
        				{
        				case 1:
        					System.out.println("101.malathi");
        					System.out.println("102.Ramani");
        					System.out.println("103.lucky");
        					System.out.println("104.karthika");

        					System.out.println("Enter the teacher Id :");
        					Scanner scan1=new Scanner(System.in);
            				int ch1=scan1.nextInt();         				
            			        				
            				
            				
        					switch(ch1)
        					{
        					case 101:

        					System.out.println("Science Teacher Data :");
        					System.out.println("Name    : "+ science.getName());
        					System.out.println("Subject : "+science.getSubject());
        					System.out.println("Salary  : "+science.getSalary());
        					break;
        					
        				
        					case 102 :
        					System.out.println("Hindi Teacher Data :");
        					System.out.println("Name    : "+hindi.getName());
        					System.out.println("Subject : "+hindi.getSubject());
        					System.out.println("Salary  : "+hindi.getSalary());
        					break;
        					
        					case 103:
        					System.out.println("Telugu Teacher Data :");
        					System.out.println("Name    : "+telugu.getName());
        					System.out.println("Subjct  : "+telugu.getSubject());
        					System.out.println("Salary  : "+telugu.getSalary());        				
        					break;
        					
        					case 104:
        					System.out.println("Maths Teacher Data :");
        					System.out.println("Name"+maths.getName());
        					System.out.println("Salary"+maths.getSubject());
        					System.out.println("Name"+maths.getSalary());
        					break;

        					}
        				}
        				switch (ch) {	
        				case 2:
        					System.out.println("121.mslr");
        					System.out.println("122.ram");
        					System.out.println("123.lucky");
        					System.out.println("124.lsa");

        					System.out.println("Enter the student Id :");
        					Scanner scan2=new Scanner(System.in);
            				int ch2=scan2.nextInt();
        				
            				
        				
        						switch(ch2)
        						{
        						case 121:
        						
            					System.out.println("Student  Data :");
            					System.out.println("Name    : "+s1.getName());
            					System.out.println("Subject : "+s1.getId());
            					System.out.println("Salary  : "+s1.getGender());
            					break;
            					
            				
        						case 122:
            				 	
            					System.out.println("Student  Data :");
            					System.out.println("Name    : "+s2.getName());
            					System.out.println("Subject : "+s2.getId());
            					System.out.println("Salary  : "+s2.getGender());
            				 	break;
            					
        						case 123:
            					System.out.println("Student  Data :");
            					System.out.println("Name    : "+s3.getName());
            					System.out.println("Subject : "+s3.getId());
            					System.out.println("Salary  : "+s3.getGender());
            					break;
            				
            					
        						case 124:
            					
            					System.out.println("Student  Data :");
            					System.out.println("Name    : "+s4.getName());
            					System.out.println("Subject : "+s4.getId());
            					System.out.println("Salary  : "+s4.getGender());
            					break;
        						}
        						
        					}
        				
        				
        			
        		
        	}	
        }


        


        				
        					
         
         
        		


