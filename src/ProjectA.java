import java.util.Scanner;
public class ProjectA {
	String id;
	String name;
	Double salary;
	Double sales;

	public ProjectA(String insert, String name , Double salary ,Double sales ) {
		// TODO Auto-generated constructor stub
		
		this.id=insert;
		this.name=name;
		this.salary=salary;
		this.sales=sales;
		 if(sales<=25000) { 
			 
			 this.sales=sales*(0.01);
			 this.salary =  this.salary + this.sales;
		        
		 }else if(sales>=25001 && sales<=50000) {

			 this.sales=sales*(0.02);
			 this.salary =  this.salary+this.sales;		        
		 }else {
			 
			 this.sales=sales*(0.03);
			 this.salary =  this.salary+ this.sales;	        
		 }
		}
		
		public void showdata(){
			System.out.println("Name : "+this.name);	
			System.out.println("Salary : " + this.salary);
		
		}
}
