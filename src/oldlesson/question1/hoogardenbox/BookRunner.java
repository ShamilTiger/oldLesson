package oldlesson.question1.hoogardenbox;

public class BookRunner {
    public static void main(String[] args) {
        ChildrenBook book1 = new ChildrenBook("Борис Пастернак", "Две книги", 1000.0, 1927, 2);
        ChildrenBook book44 = new ChildrenBook("Борис Пастернак", "Нет", 1000.0, 1927, 2);
        ChildrenBook book52 = new ChildrenBook("Борис Пастернак", "Писят два", 1000.0, 1927, 2);
        Book book2 = new Book();
        Book book3 = new Book("Пушкин нахуй", 2015);

        ChildrenLibraryHall hall1 = new ChildrenLibraryHall("12+", 5);

        System.out.println(hall1.getSize());
        System.out.println(hall1.getBooksQuantity());
        hall1.putBookInHall(book1);
        hall1.putBookInHall(book44);
        hall1.putBookInHall(book52);
        System.out.println(hall1.getSize());
        System.out.println(hall1.getBooksQuantity());
        hall1.printAllBooksName();
        System.out.println(hall1.getAllQuantity(hall1));
        hall1.printAllBooksName();



  /*      System.out.println("Книга номер 1: " + book1.getName());
        System.out.println("Книга номер 2: " + book2.getName());
        System.out.println("Книга номер 3: " + book3.getName());
        System.out.println("В моей библиотеке есть несколько читальных залов:");
        System.out.println("Зал для Симы: " + hall1.getNameHall() + ", Кол-во книг: " + hall1.getSize());


        System.out.println("Список книг до добавления новой книги: " + book3.getName() + ", " + book1.getName());
        Book book4 = new Book("Пушкин нахуй", 2015);
        System.out.println("Список книг после добавления новой книги: ");
*/




    }
}
