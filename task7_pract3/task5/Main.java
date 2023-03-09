package task7_pract3.task5;

public class Main{
    public static void main(String[] args) {
        
        // Задание No5
        // Создайте класс Phone. Переменные экземпляра – номер, модель, вес.
        // Добавить в класс конструкторы с различным количеством принимающих на вход параметров:
        //  конструктор, который принимает на вход три параметра для инициализации переменных класса
        // номер, модель, вес;
        //  конструктор, который принимает на вход два параметра для инициализации переменных класса
        // номер, модель;
        //  конструктор без параметров.
        // Реализовать вызов из конструктора с тремя параметрами конструктор с двумя.
        // Создайте методы для задания значений к ним и методы для выведения значения на консоль.
        //  Создать метод с аргументами переменной длины. Данный метод принимает на вход номера
        // телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих
        // телефонов. 
        //  Добавьте в класс Phone метод, принимающий в качестве аргумента имя звонящего. При вызове
        // этого метода должно выводиться на консоль сообщение “Звонит {name}”.

        // Java Преподаватель: Эркинбек А.
        //  Реализуйте перегрузку этого метода создав перегруженный метод, который принимает два
        // параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
        //  Добавьте метод возвращающий номер телефона.
        // Вызвать эти методы для каждого из объектов.

        class Phone{
            String number, model;
            double weight;

            Phone(String number, String model, int weight){
                this.number = number;
                this.model = model;
                this.weight = weight;
            }
            Phone(String number, String model){
                this.number = number;
                this.model = model;
            }

            public void setNumber(String number){
                this.number = number;
            }
            public void setModel(String model){
                this.model = model;
            }
            public void setWeight(int weight){
                this.weight = weight;
            }
            Phone(int test, int test2, int test3){
                this("sdf", "sdga");
            }

            public void sendMessage(String ... numbers){
                for (String number : numbers) {
                    System.out.println(number);
                }
            }

            public void UserCall(String name){
                System.out.println("Звонит " + name);
            }
            public void UserCall(String name, String name_number){
                System.out.println("Звонит " + name + "\nНомер: " + name_number);
            }

            public String getNumber(){
                return this.number;
            }
        }

        Phone Iphone = new Phone(10, 101, 11);
        // Phone Iphone = new Phone("06453462346", "IPhone X");
        Iphone.UserCall("Ilia", Iphone.getNumber());
        Iphone.setNumber("43254326");
        System.out.println(Iphone.getNumber());
    }
}