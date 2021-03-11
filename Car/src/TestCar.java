
public class TestCar {

	public static void main(String[] args) {
			
		Car myCar = new Car();
		
		myCar.setName("Toyota");
		System.out.println("This is new name " + myCar.getName());
		
		myCar.setTopSpeed(120);
		System.out.println("This is new speed " + myCar.getTopSpeed());
	}
}
