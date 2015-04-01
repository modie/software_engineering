import pcparts.cpu;
import pcparts.gpu;
import pcparts.pcParts;


public class main {
	public static void main(String args[])
	{
		System.out.println("This is for testing purposes only :) ");
		
		pcParts pc1 = new cpu();
		pcParts pc2 = new gpu();
		
		System.out.println(pc1.getCategory());
		System.out.println(pc2.getCategory());
		
		
		
	
	}

}
