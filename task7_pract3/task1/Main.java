package task7_pract3.task1;

public class Main{
    public static void main(String[] args) {
        class Numbers{
            int num1, num2;
            private double m_a, m_b, m_c;
            public void setA(double value){
                this.m_a = value;
            }
            public void setB(double value){
                this.m_b = value;
            }
            public void setC(double value){
                this.m_c = value;
            }
            
            public void print(){
                System.out.println("<" + this.m_a + ", " +  this.m_b + ", " + this.m_c + ">");
            }

            public boolean isEqual(double num1, double num2){
                return num1 == num2;
            }
        }

        Numbers numbers = new Numbers();
        numbers.setA(30);
        numbers.setB(2);
        numbers.setC(8);

        numbers.print();
    }
}