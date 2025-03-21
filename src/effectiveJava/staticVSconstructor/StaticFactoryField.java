package staticVSconstructor;

public class StaticFactoryField {
    public static void main(String[] args) {

    }
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
    
}
