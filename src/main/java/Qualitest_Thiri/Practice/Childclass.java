package Qualitest_Thiri.Practice;

public class Childclass extends ParentclassInheritance{

	public void colour()
	{
		System.out.println(colour);
	}
	public static void main(String[] args)
	{
		ParentclassInheritance i =new Childclass();
		Childclass c = new Childclass();
		i.Engine();
		i.gear();
		i.Machine();
		c.colour();
	}
}
