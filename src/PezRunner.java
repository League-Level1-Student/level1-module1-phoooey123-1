
public class PezRunner {
public static void main(String[] args) {
	Pez wa = new Pez("Seaweed", 5);
	wa.changeFriend(2);
	wa.favFood("Fish Food");
	
	System.out.println("My Pez has "+wa.numberOfFriends+" friends and his favorite food is "+wa.favoriteFood);
	
}
}
