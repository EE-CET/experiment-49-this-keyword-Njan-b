import java.util.Scanner;

class ThisKeywordDemo {

    int value; 

    void setValue(int value) {
        this.value = value;  
    }

    
    void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt(); 
        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.setValue(input);
        obj.display();
        
        sc.close();
    }
}
