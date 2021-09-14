package OOPS;

class car {
	public int gear;
	public int speed;

	public car(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}

	public void brake(int decrement)
	{
		speed -= decrement;
	}

	public void accelarate(int increment)
	{
		speed += increment;
	}

	public String toString()
	{
		return ("Stage of Gear " + gear + "\n"+ "speed of the car is :" + speed);
	}
}

// derived class
class raceCar extends car {

	// the RaceCar subclass adds one more field nitro for more speed
	public int nitro;

	public raceCar(int gear, int speed, int nitro)
	{
		super(gear, speed);
		speed *= nitro; 
	}

	// overriding toString() method of car
	@Override public String toString()
	{
		return (super.toString() + "\nspeed after nitro is " + super.speed);
	}
}

// driver class
public class inheritance {
	public static void main(String args[])
	{
		raceCar rc = new raceCar(3, 100, 2);
		System.out.println(rc.toString());
	}
}

