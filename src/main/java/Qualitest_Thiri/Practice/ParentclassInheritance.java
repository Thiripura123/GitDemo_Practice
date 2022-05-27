package Qualitest_Thiri.Practice;

public class ParentclassInheritance {
	
	public String colour="Red";
	
	public void gear()
	{
		System.out.println("Gear is implemented");
	}
	
	public void Engine()
	{
		System.out.println("Engine is implemented");
	}
	
	public void Machine()
	{
		System.out.println("Machine is implemented");
	}
	public static void main(String[] args)
	
	{
		ParentclassInheritance PI=new ParentclassInheritance();
		PI.Engine();
		PI.gear();
		PI.Machine();
	}

}
