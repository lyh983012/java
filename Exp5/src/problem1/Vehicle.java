package problem1;



class Car extends Vehicle {
	public Car() {
		System.out.println("A new Car.");
	}
	public void drive() {
		System.out.println("Car is driven"); }
	public static void brake() { System.out.println("Car is braked");
	} }
	
public class Vehicle {
	
class Bus extends Vehicle {
		public Bus() {
		System.out.println("A new Bus.");
		}
public void drive() {
	System.out.println("Bus is driven"); }
	}
//////////////////////////
public Vehicle() {
	System.out.println("A new Vehicle.");
	}
public void drive() { System.out.println("Vehicle is driven");
	}
public static void brake() { System.out.println("Vehicle is braked");
	}
	
public void test() {
	Vehicle vc = new Car();
    Bus vb = new Bus(); 
    drive();
	vc.drive();
	vb.drive();
	vc.brake();
	vb.brake();
	}
	public static void main(String[] args) 
		{ 
			Vehicle v = new Vehicle(); 
			v.test();
		} 
}