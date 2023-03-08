package task7_pract3.task7;

public class Main{
    public static void main(String[] args){
        // Задание No7
        // Создать классы Car, Engine и Driver. Поля класса Driver - ФИО, дата рождения, ИИН, паспортNo_, права
        // категории ###, стаж вождения. Поля класса Engine - мощность, производитель. Поля класса Car - марка,
        // класс, вес, водитель типа Driver, мотор типа Engine.

        // Создать методы для вывода на печать соответствующую информацию:
            //  start() — “{Driver}поехал на машине марки «{mark}»”;
            //  stop() — “Машина марки «{mark }» притормозил”;
            //  turnRight() — “Машина марки «{mark }» повернула направо”;
            //  turnLeft() — “Машина марки «{mark }» повернула налево”.
            //  printInfo() – выводит полную информацию об автомобиле, ее водителе и моторе.
        // Создать производные(реализовать наследование) от класса Car классы:
            // a) Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
            // b) SportCar, характеризуемый также предельной скоростью.

        class Driver{
            String fio;
            String date_of_birth;
            String INN;
            String passport;
            String category_right;
            int experience_drive;

            Driver(String fio, String dateString, 
                    String INN, String passport,
                    String category_right, int experience_drive) {
                this.INN = INN;
                this.date_of_birth = dateString;
                this.fio = fio;
                this.passport = passport;
                this.category_right = category_right;
                this.experience_drive = experience_drive;
            }

            public void aboutDriver(){
                System.out.println("fio:" + this.fio);
                System.out.println("birth:" + this.date_of_birth);
                System.out.println("passport:" + this.passport);
                System.out.println("category:" + this.category_right);
                System.out.println("experience:" + this.experience_drive);
                System.out.println("INN:" + this.INN);
            }
        }

        class Engine{
            int hs = 100;
            String manufacturer = "china";
            Engine(int hs, String manufacturer){
                this.hs = hs;
                this.manufacturer = manufacturer;
            }            

            public void aboutEngine(){
                System.out.println("Horse power: " + this.hs);
                System.out.println("Manufacturer: " + this.manufacturer);
            }
        }

        class Car{
            String type, name;
            int weight;
            Driver driver;
            Engine engine;
            Car(String type, String name, int weight, Driver driver, Engine engine){
                this.type = type;
                this.name = name;
                this.driver = driver;
                this.weight = weight;
                this.engine = engine;
            }

            public void start() {
                System.out.println(this.driver.fio + "поехал на машине марки «" + this.name + "»");
            }

            public void stop() {
                System.out.println("Машина марки «" + this.name + "}» притормозил");
            }

            public void turnRight(){
                System.out.println("Машина марки «" + this.name + "» повернула направо");
            }      

            public void turnLeft(){
                System.out.println("Машина марки «" + this.name + "» повернула налево");
            }    

            public void aboutCar(){
                System.out.println("type:" + this.type);
                System.out.println("name:" + this.name);
                System.out.println("weight:" + this.weight);
            }
            

            public void PrintInfo(){
                aboutCar();
                System.out.println("----------------------------\nDriver:\n");
                this.driver.aboutDriver();
                System.out.println("----------------------------\nEngine:\n");
                this.engine.aboutEngine();
            }

        }

        Driver driver = new Driver("Ilia", "09.03.21", "928369580", "39863", "B", 3);
        Engine engine = new Engine(1100, "Italy");

        Car lucidAir = new Car("car-of-future", "Lucid Air", 900, driver, engine);

        lucidAir.PrintInfo();

    }
}