package Message;

/* - Сообщение (Настя)
    - Отправитель (пользователь)
    - Получатель  (пользователь)
    - Текст
    - Дата-время
 */

public class MessageService {
    public static String[] create4Message(User user1, User user2, User user3, User user4) {
        return new String[]{"(13:24)" + user2.getNick() + ": Привет, " + user1.getName() + ", как дела?",
                "(13:28)" + user1.getNick() + ": Привет, " + user2.getName() + ", у меня хорошо!",
                "(13:43)" + user3.getNick() + ": " + user1.getName() + ", " + user2.getName() + " вы пойдете в токмач?",
                "(13:44)" + user4.getNick() + ": Я с вами!"};
    }
}