import java.util.Random;

public class asteroid
{
	private double distance, angle, diameter;
	private Random r = new Random();
	
	public asteroid()
	{
		distance=r.nextInt(50)+350;
		angle=r.nextInt(360);
		diameter=r.nextInt(6);
	}
	
	public void moveAss(){
		angle+=0.1;
	}
	public double getDistance(){
		return distance;
	}
	public double getAngle(){
		return angle;
	}
	public double getDiameter(){
		return diameter;
	}
}