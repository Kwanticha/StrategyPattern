
public class DecoyDuck extends Duck {
	
public  DecoyDuck() {
		
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoway();
		
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("I'm a DecoyDuck Durk") ;


	}
}

