class Empdriver
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
        Emp e2=new Emp("niki",50000,true);
		Emp e3=new Emp(45000,false);
		e1.empdetails();
		e2.empdetails();
		e3.empdetails(); 
	}
}
