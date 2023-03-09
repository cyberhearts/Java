package task7_pract3.task2;

public class Main{
    public static void main(String[] args) {
        // Задание No2
        // Создайте класс Stack, который реализует функционал стека.
        // Этот класс должен иметь:
        //  закрытый фиксированный массив из 10 целочисленных элементов;
        //  закрытое целочисленное значение для отслеживания длины стека;
        // Создать методы:
        //  открытый метод reset(), который будет инициализировать значением 0 длину и все значения
        // элементов;
        //  открытый метод push(), который будет добавлять значение в стек. Метод должен возвращать
        // значение false, если массив уже заполнен, в противном случае — true;
        //  открытый метод pop() для возврата значений из стека. Если в стеке нет значений, то должен
        // выводиться стейтмент assert:
        // подключаем #include <cassert>
        // в методе прописываем assert (m_next > 0);
        //  открытый метод print(), который будет выводить все значения стека.

        class Stack{
            private int[] stack = new int[10];
            private int len = stack.length;

            Stack(){
                this.len = 0;
                this.stack = new int[this.len];
            }

            public void reset(){
                for (int i = 0; i < this.stack.length; i++) {
                    this.stack[i] = 0;
                }
                this.len = 0;
            }

            public boolean push(int value){
                if(this.len + 1 >= 11){
                    System.out.println("enough");
                    return false;
                }
                int[] newarr = new int[this.stack.length + 1];
                for (int i = 0; i < this.stack.length; i++) {
                    newarr[i] = this.stack[i];
                }
                newarr[this.stack.length] = value;
                this.len++;
                this.stack = newarr;                
                return true;
            }
            
            public int pop(){
                if(this.len == 0){
                    return 404;
                }
                this.len--;
                return this.stack[this.len];
            }

            public void print(){
                for (int el : this.stack) {
                    System.out.println(el);
                }
            }
        }

        Stack stack = new Stack();
        stack.push(10);
        stack.print();
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.push(15);
        stack.push(15);
        stack.push(15);
        stack.push(15);
        System.out.println(stack.pop() + " it's here");
        stack.print();        
    }
}