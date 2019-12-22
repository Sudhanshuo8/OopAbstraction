package classwork;

public class Add
{
	int a,b,c;
	
	void add()
	{
	a=233;
	b=20;
	c=a+b;
	}
	void disp()
	{
		System.out.println("a="+a+" "+"b="+b+" "+"c="+c);
	}
	public static void main(String[]args)
	{
		Add a1=new Add();
		a1.add();
		a1.disp();
	}
	
	

}
