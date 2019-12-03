class Car 
{
	static int count;
	int id;
	String name;
	double price;
	{
		count++;
		id=count;
	}
	Car()
	{
	}
	Car(String name,double price)
	{
		//this.id=id;
		this.name=name;
		this.price=price;
	}
     Car( String name)
	{
		 this.name=name;
	}
void	cardetails()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("=============================");
	}
}
