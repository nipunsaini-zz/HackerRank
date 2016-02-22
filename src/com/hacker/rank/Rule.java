package src.com.hacker.rank;

import java.util.Comparator;

class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}

public class Rule {
	
	public static Comparator<Student> desc= new Comparator<Student>(){

		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			int cmp = ((Double)o2.getCgpa()).compareTo((Double)o1.getCgpa());
			
			if(cmp == 0){
				cmp = o1.getFname().compareTo(o2.getFname());
				if(cmp==0){
					return ((Integer)o1.getId()).compareTo((Integer)o2.getId());
				}else{
					return cmp;
				}				
			}
			else{
				return cmp;
			}
			
		}
        
    };
    

}
