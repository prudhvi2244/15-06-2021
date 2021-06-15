class Employee 
{
	//constructor without arguments
	Employee()
	{
		System.out.println("Employee Class Constructor without argument");
	}

	int eid=900;
	//constructor with 1 int arguments
	Employee(int eid)
	{
		System.out.println(this.eid);
		System.out.println(eid);
		System.out.println("Employee Class Constructor with int argument");
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee();	
		Employee e2=new Employee();	
		Employee e3=new Employee();	
		Employee e4=new Employee(100);	
	}
}
