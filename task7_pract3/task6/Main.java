
public class Main{
    public static void main(String[] args) {
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
        }

        class Book{
            String name, author;
            Book(String name, String author){
                this.name = name;
                this.author = author;
            }
        }

        class takenBooks{
            Book[] books = new Book[1];
        }
    }
}