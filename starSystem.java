public class starSystem
{
	public static void main(String[] args)
	{
		SolarSystem system =new SolarSystem(600, 600);

		system.drawSolarObject(0,135,50,"YELLOW");
		system.drawSolarObject(100,45,10,"GRAY");
		system.drawSolarObject(130,90,18,"PINK");
		system.drawSolarObject(230,0,35,"BLUE");
		system.drawSolarObject(285,200,30,"RED");
		
		system.drawSolarObjectAbout(50,195,5,"WHITE",230,0);
		
		system.finishedDrawing();
	}
}