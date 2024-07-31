class PendulumRunner{
	public static void main(String[] args){Pendulum pendulum1=new Pendulum("vertical",2000);
		pendulum1.lengthIncm=15;
		System.out.println("Pendulum length:"+pendulum1.lengthIncm);
		System.out.println("Pendulum type:"+pendulum1.Type);
		System.out.println("Pendulum Angle:"+pendulum1.Angle);
		System.out.println("Pendulum cost:"+pendulum1.cost);
		
		System.out.println("\n");
		Pendulum pendulum2=new Pendulum("Horizantal",3000);
		pendulum2.lengthIncm=15;
		System.out.println("Pendulum length:"+pendulum2.lengthIncm);
		System.out.println("Pendulum type:"+pendulum2.Type);
		System.out.println("Pendulum Angle:"+pendulum2.Angle);
		System.out.println("Pendulum cost:"+pendulum2.cost);
	}
}