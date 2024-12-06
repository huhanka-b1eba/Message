package Message;

/*
- Программа моделирует мессенджер
- Пользователь(Саня)
    - ник найм
    - имя пользователя
    - телефон
    - пароль
- Сообщение (Настя)
    - Отправитель (пользователь)
    - Получатель  (пользователь)
    - Текст
    - Дата-время

- Программа (Айгиз)
  - Создать 4 пользователя (UserService - create4Users)
  - Создать 4 сообщения MessageService - create4Message(user1,user2, user3,user4)
  - Вывести сведения о пользователях
  - Вывести сведения о сообщениях

- 1 создает общий публичный репозиторий на github +
- дать права остальным участникам +
- Договариваемся об именовании пакетов
 */

public class App {
    public static void main(String[] args) {
        User[] arrayUser = UserService.create4Users();
        String[] mesages = MessageService.create4Message(arrayUser[0], arrayUser[1], arrayUser[2], arrayUser[3]);
        for(int i = 0; i < arrayUser.length; i++) {
            System.out.println(arrayUser[i].getNick());
            System.out.println(arrayUser[i].getName());
            System.out.println(arrayUser[i].getPhone());
            System.out.println(arrayUser[i].getPassword());
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < mesages.length; i++) {
            System.out.println(mesages[i]);
        }
    }
}
