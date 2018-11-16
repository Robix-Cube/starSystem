public class starSystem
{
	public static void main(String[] args)
	{
		//initilise window, RNG and speed values
		SolarSystem system =new SolarSystem(850, 850);
		int planetSpeed=1;
		int moonSpeed=1;
		int noOfAsteroids=500;
		
		//initialise asteroid array and fill it
		asteroid[] AA=new asteroid[noOfAsteroids];
		for (int i=0;i<noOfAsteroids;i++){
			AA[i]=new asteroid();
		}

		
		while(true)
		{
		//draw sun and planets
		system.drawSolarObject(0,0,50,"YELLOW");
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
			for (int i=0;i<noOfAsteroids;i++)
				system.drawSolarObject(AA[i].getDistance(),AA[i].getAngle(),AA[i].getDiameter(),"WHITE");
		}catch(NullPointerException e)
		{
			System.out.println("Caught");
		}
		
		//finalise
		system.finishedDrawing();
		try
		{
			for (int j=0;j<noOfAsteroids;j++)
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
