public class starSystem
{
	public static void main(String[] args)
	{
		//initilise window, RNG and speed values
		SolarSystem system =new SolarSystem(850, 850);
		int planetSpeed=1;
		int moonSpeed=1;
		
		asteroid[] AA=new asteroid[8];
		
		while(true)
		{
		//draw sun and planets
		system.drawSolarObject(0,135,50,"YELLOW");
		system.drawSolarObject(100,45+planetSpeed,10,"GRAY");
		system.drawSolarObject(130,90+planetSpeed,18,"PINK");
		system.drawSolarObject(230,0+planetSpeed,35,"BLUE");
		system.drawSolarObject(285,200+planetSpeed,30,"RED");
		
		//draw moons
		system.drawSolarObjectAbout(50,195+planetSpeed,5,"WHITE",230,0+moonSpeed);
		system.drawSolarObjectAbout(50,345+planetSpeed,2,"WHITE",285,200+moonSpeed);
		
		//draw asteroid belt
		try
		{
			for (int i=0;i<8;i++)
				system.drawSolarObject(AA[i].getDistance(),AA[i].getAngle(),AA[i].getDiameter(),"WHITE");
		}catch(NullPointerException e)
		{
			System.out.println("Caught");
		}
		
		//finalise
		system.finishedDrawing();
		try
		{
			for (int j=0;j<8;j++)
				AA[j].moveAss();
		}catch(NullPointerException e)
		{
			System.out.println("Caught");
		}
		planetSpeed+=1;
		moonSpeed+=1;
		}
	}
}