package Strings;

public class builderBuffer {
    public static void concat(String s1)
    {
        s1 += "Phoenix";
    }
 
    public static void builder(StringBuilder s2)
    {
        s2.append(" - Developer");
    }
 
    public static void buffer(StringBuffer s3)
    {
        s3.append("\tDeveloper");
    }
 
    public static void main(String[] args)
    {
        String s1 = "Narayanan";
        concat(s1);     //  s1 is immutable
        System.out.println("String: " + s1);
 
        StringBuilder s2 = new StringBuilder(s1);
        builder(s2);    // s2 is changed
        System.out.println("StringBuilder: " + s2);
 
        StringBuffer s3 = new StringBuffer(s1);
        buffer(s3);     // s3 is changed
        System.out.println("StringBuffer: " + s3);
        System.out.println(s2.length()+" "+s3.length());  
    }
}
