import java.util.Scanner;

public class lab2_java {
    public static void task1(String word){
        Scanner scan = new Scanner(System.in);
        String searched_word = "";
        String text = "";
        int vowels_count = 0;
        while(true){
            searched_word = scan.nextLine();
            if(searched_word.equals(word)){
                break;
            }
            else{
                text += searched_word;
            }
        }
        System.out.println(text);
        System.out.print("Vowels count: ");
        for(int i = 0; i < text.length(); i++) {       
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {     
                vowels_count++;    
            }
        } 
        System.out.print(vowels_count);
        System.out.println("last 3 word: " + text.substring(text.length() - 3, text.length()));
        scan.close();
    }
    public static final String EMPTY_STRING = "";
    public static String ltrim(String str) {
        return str.replaceAll("^\\s+", EMPTY_STRING);
    }
    public static String rtrim(String str) {
        return str.replaceAll("\\s+$", EMPTY_STRING);
    }
    public static void task2(){
        String text = " Я помню ЧУДНОЕ мгновение ";
        System.out.println(text);
        System.out.println(ltrim(text));
        System.out.println(rtrim(text));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        // String will be equals only if they fully match
        System.out.println(text.toUpperCase().equals(text.toLowerCase()) + " - UpperCase and LowerCase");
    }
    public static void task3(String word, String word2){
        String text = "j;lasdkj cxnv, somegthing cxn sdj dojg la clkj laskd c josdaj somegthing flc osajdf ";
        System.out.println(text);
        String temp = text.replace(word, word2);
        System.out.println(temp);
    }
    public static void main(String args[]){
        task3("somegthing", "no");
    }
}
