class Customer 
{
	int cid;
	String cname;
	String city;
	Customer(int cid,String cname,String city)
	{
		this.cid=cid;
		this.cname=cname;
		this.city=city;
	}
	public static void main(String[] args) 
	{
		Customer c1=new Customer(1,"Prudhvi","Goa");
		Customer c2=new Customer(2,"Rajeev","Bangalore");
		Customer c3=new Customer(3,"Raj","Hyderabad");


		System.out.println("Customer ID:"+c1.cid);
		System.out.println("Customer Name:"+c1.cname);
		System.out.println("Customer City :"+c1.city);

		System.out.println("********************************************");

		System.out.println("Customer ID:"+c2.cid);
		System.out.println("Customer Name:"+c2.cname);
		System.out.println("Customer City :"+c2.city);

		System.out.println("********************************************");

		System.out.println("Customer ID:"+c3.cid);
		System.out.println("Customer Name:"+c3.cname);
		System.out.println("Customer City :"+c3.city);
		
	}
}
