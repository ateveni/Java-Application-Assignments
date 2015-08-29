
import java.util.*;

//CONSTRUCTORS
public class ThePoint 
{
	private int x;
	private int x2;
	private int y;	
	private int y2;


public ThePoint()
{
	x = 2;
	x2 = 1 //Missing semicolon
	y = 4;
	y2 = 3;
}

public ThePoint (int x, int x2, int y, int y2)
{
	this.x = x;
	this.x2 = x2;
	this.y = y;
	this.y2 = y2;
}

/*public distance(int x, int x2, int y, int y2)  //Missing return type, should be int
{
	int distance;
	distance = sqrt((Math.pow((x2-x),(x2-x))+(Math.pow((y2-y),(y2-y)))); //Missing return statement, also sqrt should be Math.sqrt
}*/

//ACCESSORS
public int getX()
{
	return x;
}

public int getX2()
{
	return x2;
}

public int getY()
{
	return y;
}
public int getY2 //Missing parantheses
{
	return y2;
}

public void setX(int x)
{
	this.x = x;
}

public void setX2(int x2)
{
	this.x2 = x2;
}

public void setY(int y)
{
	this.y = y;
}

public void setY2(int y2)
{
	this.y2 = y2;
}
}
