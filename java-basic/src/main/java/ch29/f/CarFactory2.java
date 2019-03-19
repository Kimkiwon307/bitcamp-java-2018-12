package ch29.f;

public class CarFactory2 {
	
	BlackBox blackBox;

	public CarFactory2(BlackBox blackBox) {
		System.out.println("carfactory2생성자");
		this.blackBox = blackBox;
	}
	
	
	
	@Override
	public String toString() {
		return "CarFactory2 [blackBox=" + blackBox + "]";
	}



	public  Car create(String model) {
		Car c = new Car();
		c.setBlackBox(blackBox);
	
		switch(model) {
		case "tico" : 
			c.setMaker("쉬보레");
			c.setModel("tico2019");
			c.setCc(900);
			c.setValve(16);
			c.setAuto(true);
			break;
		case "sonata" :
			c.setMaker("현대자동차");
			c.setModel("소나타 골드");
			c.setCc(98000);
			c.setValve(16);
			c.setAuto(true);
			break;
		case "equus" :
			c.setMaker("현대자동차");
			c.setModel("에쿠스 그린");
			c.setCc(999);
			c.setValve(16);
			c.setAuto(true);
			break;
		default :
			c.setMaker("비트자동차");
			c.setModel("비트카트");
			c.setCc(9555500);
			c.setValve(16);
			c.setAuto(true);
			break;
		}
		return c;
	}
}
