package homeworkWeek4.Prob1;

public class RestaurantApp {

	public static void main(String[] args) {	
		Restaurant vegetarian = new Restaurant(Restaurant.TypeOfRestaurant.vegetarian);
		Restaurant fastFood = new Restaurant(Restaurant.TypeOfRestaurant.fastFood);
		
		vegetarian.newGuest();
        vegetarian.newGuest();
        
        fastFood.newGuest();
        fastFood.newGuest();

        vegetarian.printIncomeAndRestaurantTax();
        fastFood.printIncomeAndRestaurantTax();
	}
}
