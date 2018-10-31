import java.util.Scanner;
public class ProjectC {
	String id;
	String name;
	Double salary;
	Double sales;
	int bonus;

	public ProjectC(String insert, String name , Double salary ,Double sales ) {
		// TODO Auto-generated constructor stub
		
		this.id=insert;
		this.name=name;
		this.salary=salary;
		this.sales=sales;
		this.bonus=0;
		
		
		if(this.salary < 15000 && this.sales > 100000) {
			 this.bonus = 3000;
		}
		
		 if(sales<=50000) { 
			 
			 this.sales=sales*(0.01);
			 this.salary =  this.salary + this.sales;
		        
		 }else if(sales>=50001 && sales<=100000) {

			 this.sales=sales*(0.02);
			 this.salary =  this.salary+this.sales;		        
		 }else {
			 
			 this.sales=sales*(0.03);
			 this.salary =  (this.salary+ this.sales)+this.bonus;	        
		 }
		}
		
		public void showdata(){
			System.out.println("Name : "+this.name);	
			System.out.println("Salary : " + this.salary);
		
		}
}
