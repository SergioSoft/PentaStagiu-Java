package homeworkWeek4.Prob1;

public class Restaurant {
	    int numberOfGuests = 0;
	    double income = 0;
	    static double priceForMenu = 15.99;
	    double localTax;
	    TypeOfRestaurant typeOfRestaurant;

	    enum TypeOfRestaurant {
	        vegetarian, fastFood;
	    }
	    public Restaurant() {
	    	
	    }
	    public Restaurant(TypeOfRestaurant typeOfRestaurant) {
	        this.typeOfRestaurant = typeOfRestaurant;
	    }

	    public void newGuest() {
	        numberOfGuests++;
	        income = income + priceForMenu;
	    }

	    public void taxCalc() {
	        localTax = income * 0.2;
	        switch (typeOfRestaurant) {
	            case vegetarian:
	                localTax = localTax - (localTax * 0.3);
	            case fastFood:
	        }
	    }

	    public void printIncomeAndRestaurantTax() {
	        taxCalc();
	        System.out.println("Income: " + income + " have to pay: " + localTax);
	    }
	}
