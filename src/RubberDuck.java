
public class RubberDuck extends Duck {
	
	public RubberDuck() {
		
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoway();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Rubber Durk") ;

	}

}
