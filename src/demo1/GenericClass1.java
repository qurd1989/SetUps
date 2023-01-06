package demo1;

public class GenericClass1<T, E> {


    T item1;
    E item2;


    public GenericClass1(T item1, E item2) {

        this.item1 = item1;
        this.item2 = item2;

    }

    public E getItem2() {
        return item2;
    }

    public void setItem2(E item2) {
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void printItems() {


        System.out.println("Priting Conetent of GenericCalss1");
        System.out.println("Item1: " + item1);
        System.out.println("Item2: " + item2);

    }

}
