
public class ReadHeadDuck extends Duck {
	
	public ReadHeadDuck() {
	
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a ReadHead Durk") ;

	}

}
