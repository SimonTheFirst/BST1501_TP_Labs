import java.util.Scanner;
public class Lab2
{
	public static void main(String[] args)
	{
		/*
		Point3d point1 = inputPoint();
		Point3d point2 = inputPoint();
		Point3d point3 = inputPoint();
		double S = computeArea(point1,point2,point3);
		if (S==0.0)
			System.out.println("Cannot compute area, two or more points are equal");
		else
			System.out.println("Area is " + S);
			*/
		PointFileIO pfio = new PointFileIO("C://Users/User/Desktop/javaLabs/");
		pfio.compute();

	}

	public static Point3d inputPoint ()
	{
		Point3d point = new Point3d();
		Scanner scan = new Scanner(System.in);
		System.out.println("Create new point ");
		System.out.println("Enter x: ");
		double x = Double.parseDouble(scan.nextLine());
		point.setX(x);
		System.out.println("Enter y: ");
		double y = Double.parseDouble(scan.nextLine());
		point.setY(y);
		System.out.println("Enter z: ");
		double z = Double.parseDouble(scan.nextLine());
		point.setZ(z);
		return point;
	}

	public static double computeArea(Point3d point1, Point3d point2, Point3d point3)
	{
		if (point1.compareTo(point2) || point2.compareTo(point3) || point1.compareTo(point3))
			return 0.0;
		double a = point1.distanceTo(point2);
		double b = point2.distanceTo(point3);
		double c = point1.distanceTo(point3); 
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}