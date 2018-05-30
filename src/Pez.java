
public class Pez {
	


public String favoriteFood;
public int numberOfFriends;

 Pez(String favoriteFood, int numberOfFriends) {
  	this.favoriteFood = favoriteFood;
  	this.numberOfFriends = numberOfFriends;
}
 
void changeFriend(int friend) {
	numberOfFriends = friend;

}

void favFood(String food) {
	favoriteFood = food;
}
}
