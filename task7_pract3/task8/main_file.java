package task7_pract3.task8;

public class main_file{

    // Задание No8
    // Реализовать работу интернет магазина.
    // Создать классы:
    //  Товар. Поля класса – имя, цена, рейтинг.
    //  Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса
    // Категория.
    //  Basket, содержащий массив купленных товаров.
    //  User, содержащий логин, пароль и объект класса Basket. Создать объект класса User

    public static void main(String[] args){

        class Item{
            public String name;
            public double price, rate;
            Item(String name, double price, double rate){
                this.name = name;
                this.price = price;
                this.rate = rate;
            }
        }
    
        class Category{
            String name;
            Item[] category_arr = new Item[1];
            Category(String category_name, Item[] items){
                this.name = category_name;
                this.category_arr = items;               
            }

            public void get_category(){
                for (Item string : this.category_arr) {
                    System.out.println(string.name);
                }
            }
        }
    
        class Basket{
            String[] item_to_buy = new String[1];
            Basket(){}
        }
    
        class User{
            String login;
            private String password;
            Basket basket = new Basket();
            User(String login, String password){
                this.login = login;
                this.password = password;
            }

            public void buy_item(Item item_name){
                String[] temp = new String[this.basket.item_to_buy.length + 1];
                for (int i = 0; i < this.basket.item_to_buy.length; i++) {
                    temp[i] = this.basket.item_to_buy[i];
                }
                temp[this.basket.item_to_buy.length - 1] = item_name.name;

                this.basket.item_to_buy = temp;
            }

            public void print_basket(){
                for (int i = 0; i < this.basket.item_to_buy.length - 1; i++) {
                    System.out.println(this.basket.item_to_buy[i]);
                }
            }
        }

        Item item1 = new Item("milk", 2, 1);
        Item item2 = new Item("banan", 10, 5);
        Item item4 = new Item("banan", 10, 5);
        Item item5 = new Item("banan", 10, 5);
        
        Item[] listVeg = new Item[1];
        listVeg[0] = item1;
        Item[] listMilk = new Item[4];
        listMilk[0] = item2;
        listMilk[1] = item1;
        listMilk[2] = item4;
        listMilk[3] = item5;
        User sudo = new User("Ilia", "cool");
        Category vegetables = new Category("vegetables", listVeg);
        Category milk = new Category("milk", listMilk);

        sudo.buy_item(item1);     
        sudo.buy_item(item2);
        sudo.buy_item(item4);
        sudo.buy_item(item5);
        sudo.print_basket();      
        
        System.out.println("00000000000000000000000000000000");
        
        vegetables.get_category();
        System.out.println("00000000000000000000000000000000");
        milk.get_category();
    }
}