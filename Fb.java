class Fb 
{ 
	static int count;
	int id;
	String pwd;
	{
		count++;
		id=count;
	}
	Fb( String pwd)
	{
		this.pwd=pwd;
	}
void	fbdetails()
	{   
		System.out.println("Fbid:"+ id);
		System.out.println("pwd:"+pwd);
	}
}
	

