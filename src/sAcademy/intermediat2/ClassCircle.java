package intermediat2;

import IntroductionToProgramming.Circle;

public class ClassCircle {

    double   radius;
    double pi = 3.14;


    public ClassCircle(double radius){

        this.radius = radius;

    }

    float perimeter() {
        return (float) (2* pi* radius);
    }

    float area() {
        return (float) (pi * radius * radius);
    }

    public static void main(String[] args) {

         ClassCircle classCircle = new ClassCircle(3);
        System.out.println(classCircle.perimeter());
         classCircle.area();

    }
}
