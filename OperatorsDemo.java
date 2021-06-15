class OperatorsDemo 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=100;
		String mobile=null;

		System.out.println("a and b are equal? "+(a==b));
		System.out.println("a and b are not equal? "+(a!=b));
		System.out.println("a is greater than b? "+(a>b));
		System.out.println("a is less than b? "+(a<b));
		System.out.println("a is greater than or equal to b? "+(a>=b));
		System.out.println("a is less than or equal to b? "+(a<=b));

		OperatorsDemo obj=new OperatorsDemo();
		System.out.println(obj instanceof OperatorsDemo);
		System.out.println("Prudhvi" instanceof String);
	
	}
}
