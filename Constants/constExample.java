package Constants;

public class constExample {
    private static final int PRICE = 3000;   //identifier name must be in capital letters
    public static void main(String[] args) {
        // PRICE = 4000; Final immutable
        System.out.println("Old Price is : "+PRICE);
        constEx.display();
        // sample go = sample.getobj();
        // go.display();
    }
    
    static class constEx
    {
        private static final int PRICE = 5000;
        static void display()
        {
            System.out.println("The New Price : "+PRICE);
        }
    }
}