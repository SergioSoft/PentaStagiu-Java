package homeworkWeek3.Prob4;

public class StartApp {

	public static void main(String[] args) {
        User user1 = new User("Sergiu", "softsergios@gmail.com");
        Message message1 = new Message(user1, "JavaLearning", "Java is one of the most popular and widely used programming language and platform");
        Board board = new Board();
        board.addMessage(message1);

        User user2 = new User("Ion", "ion23@yahoo.com");
        Message message2 = new Message(user2, "PhpLearning", " PHP is a server-side scripting language used on the vast majority of the most popular websites on the internet");
        board.addMessage(message2);

        board.printMessageList();

    }
}