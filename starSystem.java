import java.util.Random;

public class starSystem
{
	/*private static int generateRandom(int min, int max)
	{
	// max - min + 1 will create a number in the range of min and max, including max. If you don´t want to include it, just delete the +1.
	// adding min to it will finally create the number in the range between min and max
	return r.nextInt((max-min)+1) + min;
	}*/
	public static void main(String[] args)
	{
		SolarSystem system =new SolarSystem(800, 800);
		Random r = new Random();

		system.drawSolarObject(0,135,50,"YELLOW");
		system.drawSolarObject(100,45,10,"GRAY");
		system.drawSolarObject(130,90,18,"PINK");
		system.drawSolarObject(230,0,35,"BLUE");
		system.drawSolarObject(285,200,30,"RED");
		
		system.drawSolarObjectAbout(50,195,5,"WHITE",230,0);
		system.drawSolarObjectAbout(50,345,2,"WHITE",285,200);
		
		for (int i=0;i<200;i++)
			system.drawSolarObject(r.nextInt(50)+320,r.nextInt(360),r.nextInt(6),"WHITE");
		
		system.finishedDrawing();
	}
	
}