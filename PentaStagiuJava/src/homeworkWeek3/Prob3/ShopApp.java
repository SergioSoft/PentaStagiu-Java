package homeworkWeek3.Prob3;

public class ShopApp {

	public static void main(String[] args) {
        Customer Customer1 = new Customer(1, "Sergiu", Customer.membership.Gold);        
        Book Book1 = new Book(1, "Romeo - Julieta", 100, "William Shakespeare");
        Candy Candy1 = new Candy(1, "Poiana", 12, 120);

        Basket Basket1 = new Basket(Customer1);
        Basket1.addBookInBasket(Book1);
        Basket1.addCandyInBasket(Candy1, 50);
        Basket1.totalPricePrinter();
        Customer1.setMembership(Customer.membership.Silver);
        Basket1.cashOut();
    }
}