class Ac 
{
	static int count;
	int id;
	String name;
	double price;
	{
		count++;
		id=count;
	}
	Ac(int id,String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	Ac ()
	{
	}
	Ac(String name)
	{
		this.name=name;
	}
	Ac(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
 void	acdetails()
	{
		System.out.println("id:"+id);
		System.out.println("=====================================");
		System.out.println("name:"+name);
		System.out.println("=====================================");
		System.out.println("price:"+price);
		System.out.println("=====================================");
	}

	
}
