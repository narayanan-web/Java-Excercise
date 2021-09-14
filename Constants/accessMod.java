package Constants;

public class accessMod {
    private static final int PRICE = 3000;   //identifier name must be in capital letters
    public static void main(String[] args) {
        // PRICE = 4000; Final immutable
        System.out.println("Old Price is : "+PRICE);
        //constEx obj = new constEx();
        constEx.display();
        sample go = sample.getobj();
        go.display();
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

class sample
    {
        
        static sample getobj()
        {
            return new sample();
        }
        private sample()
        {
            System.out.println("gdfhdhdhh");
        }
        void display()
        {
            System.out.println("sdfsdf");
        }
    } 