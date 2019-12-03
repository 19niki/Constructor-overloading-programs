class Laptop 
{
	static int count;
	int pid;
	int ram;
	double price;
	{
		count++;
		pid=count;
	}
	Laptop(int ram, double price)
	{
		this.ram=ram;
		this.price=price;
	}
   void	laptopdetails()
	{
		System.out.println("product id:"+ pid);
		System.out.println("ram size:"+ ram);
		System.out.println("price:"+ price);
		System.out.println("===================================================");
	}
	}

	