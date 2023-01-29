package demo1;

public class CastingType {


    public static void main(String[] args) {


        // verifying if if Object Reference is indeed  an istance of  referenceType

        Number n;

        Integer i;

        n = Integer.valueOf(3);

        if (n instanceof Integer);
        i = (Integer) n;

        n = Double.valueOf(3.455);
        if (n instanceof Double);
        i = (Integer) n;


    }
}
