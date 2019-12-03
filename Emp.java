class Emp 
{
	static int count;
	int eid;
	String ename;
	double sal;
	boolean status;
	{
		count++;
		eid=count;
		
	}

Emp()
	{

	}
	Emp(double sal,boolean status)
	{
		this.sal=sal;
		this.status=status;
	}
Emp(String ename,double sal,boolean status)
	{
	this.ename=ename;
	this.sal=sal;
	this.status=status;
	}
 void empdetails()
	{
	 System.out.println("emp id:"+eid);
System.out.println("Emp name:"+ename);
System.out.println("emp sal:"+sal);
if(status==true)
		{
	System.out.println("emp status is:married");
		}
		else
			System.out.println("emp status is:single");
		
System.out.println(" ==================================");
	}
}



	