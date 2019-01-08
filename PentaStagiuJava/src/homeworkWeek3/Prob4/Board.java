package homeworkWeek3.Prob4;

import java.util.ArrayList;

public class Board {
    ArrayList<Message> messageList;

    public Board(ArrayList<Message> messageList) {
        this.messageList = messageList;
    }
    public Board() {
        messageList = new ArrayList<Message>(1);
    }

    void addMessage(Message message) {
        messageList.add(message);
    }

    void printMessageList() {
        for (int i = 0; i < messageList.size(); i++)
            System.out.println(messageList.get(i));
    }

    void printTheMessagesOfAPerson(User user) {
        boolean userExist = false;
        for (int i = 0; i< messageList.size(); i++ ) {
            if (messageList.get(i).user.equals(user)) {
                System.out.println(messageList.get(i));
                userExist = true;
            }
        }
        if (userExist == false)
            System.out.println("The User wasn't found");
    }
    @Override
    public String toString() {
        return "Board{" + "messageList=" + messageList + '}';
    }
}