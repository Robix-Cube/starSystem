import java.util.Random;
public class starSystem
{
	public static void main(String[] args)
	{
		//initilise window and RNG
		SolarSystem system =new SolarSystem(850, 850);
		Random r = new Random();

		//draw sun and planets
		system.drawSolarObject(0,135,50,"YELLOW");
		system.drawSolarObject(100,45,10,"GRAY");
		system.drawSolarObject(130,90,18,"PINK");
		system.drawSolarObject(230,0,35,"BLUE");
		system.drawSolarObject(285,200,30,"RED");
		
		//draw moons
		system.drawSolarObjectAbout(50,195,5,"WHITE",230,0);
		system.drawSolarObjectAbout(50,345,2,"WHITE",285,200);
		
		//draw asteroid belt
		for (int i=0;i<200;i++)
			system.drawSolarObject(r.nextInt(50)+350,r.nextInt(361),r.nextInt(6),"WHITE");
		
		//finalise
		system.finishedDrawing();
	}
}