package JNI;

public class jniProgram {
    public native void display();
    static {
        System.loadLibrary("hello");
    }
    public static void main(String[] args) {
        new jniProgram().display();
    }
}
