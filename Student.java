class Student
{  // start of class
  int sid=10;//primitive variable and instance variable
  static String sname="Raj"; //static variable and Reference Variable 
 
	Student()
	{   // start of constructor

	}  //end of constructor

  public static void main(String[] args)
	{ // start of main() method
		Student s1;//Reference Variable
		s1=new Student();//s1 is holding Student object
		String email="raj.rajeev2244@gmail.com";//Reference Variable and local variable
		System.out.println("Student Id :"+s1.sid);
		System.out.println("Student Name :"+sname);
		System.out.println("Student Name :"+s1.sname);
		System.out.println("Student Name :"+Student.sname);
		System.out.println("Student Email :"+email);
	} // end of main() method
} //end of class