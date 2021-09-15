package OOPS;

import java.util.Scanner;

class car {
	public int gear;
	public int speed;

	public car(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}

	public void brake()
	{
		speed -= 50;
	}
	public void accelarate()
	{
		speed += 50;
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
		this.speed = speed;
	}

	// overriding toString() method of car
	@Override public String toString()
	{
		return (super.toString());
	}
}

// driver class
public class inheritance {
	
	static Scanner nar = new Scanner(System.in);

	static void control(car xCar)
	{
		while(true)
		{
			System.out.println("If you want to accelarate press 1 or Brake press 0, stop the drive press 9");
			int option = nar.nextInt();
			if(option==1)
			{
				xCar.accelarate();
				System.out.println(xCar.toString());
			}
			else if(option==0)
			{
				xCar.brake();
				System.out.println(xCar.toString());
			}
			else
				break;
		}
	}
	public static void main(String args[])
	{
		car c = new car(2, 50);
		raceCar rc = new raceCar(3, 100, 2);
		System.out.println("If you want racecar or normal car");
		char t = nar.next().charAt(0);
		if(t=='r')
		{
			System.out.println(rc.toString());
			control(rc);
		}
		else
		{
			System.out.println(c.toString());
			control(c);
		}
	}
}

