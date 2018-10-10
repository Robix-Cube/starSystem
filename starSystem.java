import java.util.Random;
public class starSystem
{
	public static void main(String[] args)
	{
		//initilise window, RNG and speed values
		SolarSystem system =new SolarSystem(850, 850);
		Random r = new Random(1);
		int planetSpeed=1;
		int moonSpeed=1;
		
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
		for (int i=0;i<10;i++)
			system.drawSolarObject(r.nextInt(50)+350,r.nextInt(360),r.nextInt(6),"WHITE");
		
		//finalise
		system.finishedDrawing();
		planetSpeed+=1;
		moonSpeed+=1;
		}
	}
}