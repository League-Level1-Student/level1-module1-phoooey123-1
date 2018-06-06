
public class TacoRunner {
public static void main(String[] args) {
	Taco FishTaco = new Taco("Fish","Salsa");
	System.out.println("Yum Yum "+FishTaco.getMeat()+" taco with "+ FishTaco.getSauce());
	FishTaco.setMeat("chicken");
	FishTaco.setSauce("Hot Sauce");
	System.out.println("Yum Yum "+FishTaco.getMeat()+" taco with "+ FishTaco.getSauce());
}
}
