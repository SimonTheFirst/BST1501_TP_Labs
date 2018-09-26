public class Point3d
{
	double coordX;
	double coordY;
	double coordZ;

	public Point3d()
	{
		this(0.0,0.0,0.0);
	}

	public Point3d(double x, double y, double z)
	{
		this.coordX = x;
		this.coordY = y;
		this.coordZ = z;
	}

	public void setX (double x)
	{
		this.coordX = x;
	}

	public void setY (double y)
	{
		this.coordY = y;
	}

	public void setZ (double z)
	{
		this.coordZ = z;
	}

	public double getX ()
	{
		return this.coordX;
	}

	public double getY ()
	{
		return this.coordY;
	}

	public double getZ ()
	{
		return this.coordZ;
	}

	public boolean compareTo(Point3d point)
	{
		if (this.coordX == point.getX() && this.coordY == point.getY() && this.coordZ == point.getZ())
			return true;
		return false;
	}

	public double distanceTo(Point3d point)	
	{
		return Math.sqrt(Math.pow(point.getX() - this.coordX , 2.0) + Math.pow(point.getY() - this.coordY ,2.0) + 
				Math.pow(point.getZ() - this.coordZ ,2.0));
	}

}
