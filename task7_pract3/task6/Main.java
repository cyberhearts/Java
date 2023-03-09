
public class Main{
    public static void main(String[] args) {
        // Задание No6
        // Создайте класс Читатель.
        // Этот класс должен иметь:
        //  Переменные экземпляра – номер читательского билета, ФИО, факультет, дата рождения, телефон.✅
        // Создать методы:
        //  Создать методы для инициализации переменных класса.✅
        //  Создать метод для получения информации о взявшем книгу. В дальнейшем нужно будет
        // реализовать перегрузку этого метода.✅
        // Создать новый класс Книга, содержащий имя и автора книги.✅
        // Создать третий класс, в котором создается массив объектов данного класса.✅
        // Реализуйте в классе:
        //  Создание переменного количества объектов класса Книга. Вывести на консоль сообщение:
        // "{name} взял книги: {bookname1, bookname2, ..., booknameN}".✅
        //  Перегрузку метода класса Читатель, предоставлявшем информацию о взявшем книгу из
        // библиотеки следующим образом:
        // Перегруженные методы должны будут принимать:
        // a) количество взятых книг. Вывести на консоль сообщение: "{name} взял {count} книги".
        // b) переменное количество названий книг. Вывести на консоль сообщение: "{name} взял книги:
        // {bookname1, bookname2, ..., booknameN}".✅
        //  Перегрузить метод, предоставляющий информацию о возвращенных книгах в библиотеку. Вывести
        // на консоль сообщение: "{name} вернул книги: {bookname1, bookname2, ..., booknameN}" и "{name}
        // вернул {count} книги ".
        class Book{
            String name, author;
            Book(String name, String author){
                this.name = name;
                this.author = author;
            }
        }
        
        class Reader{
            int reader_id;
            String fio, facult, birth, phone_number;

            public void setId(int value) {
                this.reader_id = value;
            }
            public void setFIO(String fio){
                this.fio = fio;
            }
            public void setFacult(String facultName){
                this.facult = facultName;
            }
            public void setBirth(String birth){
                this.birth = birth;
            }
            public void setPhone(String phone){
                this.phone_number = phone;
            }
            
            public void getReader(){
                System.out.println(this.fio + " " + this.facult + " " + this.phone_number);
            }

            public void getReader(int count){
                System.out.println(this.fio + " взял " +count + " книги");
            }

            public void getReader(Book... bookNames) {
                System.out.print(this.fio + " взял книги: ");
                for (int i = 0; i < bookNames.length; i++) {
                    System.out.print(bookNames[i].name);
                    if (i < bookNames.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }
        
        class Library{
            Library[] lib;
           
            public void takeBooks(Reader name, Book ... books){
                System.out.println(name.fio + " взял книги: ");
                for (Book book : books) {
                    System.out.println(book.name);
                }
            }
            public void takeBooks(Reader name,  int count, Book ... books){
                System.out.println(name.fio + " вернул книги: ");
                for (Book book : books) {
                    System.out.println(book.name);
                }
                System.out.println("Вернул кол-во " + count+ " книг" );
            }

            public void getReader(Reader name, String... bookNames) {
                System.out.print(name.fio + " взял книги: ");
                for (int i = 0; i < bookNames.length; i++) {
                    System.out.print(bookNames[i]);
                    if (i < bookNames.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
            

        
        }

        
            Reader rd = new Reader();
            rd.setFIO("ILia");
            Book book1 = new Book("Война и мир", "sld");
            Book book2 = new Book("Преступление и наказание", "sdf");
            Library lib = new Library();
            lib.takeBooks(rd, book1, book2);
            rd.getReader();
            rd.getReader(book1, book2);
    }

}
