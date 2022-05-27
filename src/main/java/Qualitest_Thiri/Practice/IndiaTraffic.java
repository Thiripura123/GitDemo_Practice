package Qualitest_Thiri.Practice;

public class IndiaTraffic implements CentralTraffic {

	public static void main(String[] args) {
		
		CentralTraffic ct=new IndiaTraffic();
		IndiaTraffic it =new IndiaTraffic();
		ct.goGreen();
		ct.GoYellow();
		ct.GoRed();
		it.walking();
		
	}
	


	@Override
	public void goGreen() {
		System.out.println("Flash green. Start");
		
	}

	@Override
	public void GoRed() {
		System.out.println("Flash Red. Stop");
		
	}

	@Override
	public void GoYellow() {
		System.out.println("Flash yellow. get ready");
		
	}
	
	public void walking()
	
	{
		System.out.println("Walking");
	}
	
}
