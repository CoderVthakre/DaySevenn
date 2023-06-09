package Assisment;

class Test {

    int k=20;
    double d=66.33;
    float f=3443.3f;
    boolean b=true;
    String p;

    public void printValue() {
        System.out.println("int default value = "+ k);
        System.out.println("double default value = "+ d);
        System.out.println("float default value = "+ f);
        System.out.println("boolean default value = "+ b);
        System.out.println("String default value = "+ p);
    }
}

public class PrimitiveData {
    public static void main(String argv[]) {
        Test test = new Test();
        test.printValue();
    }
}