package pro.junseok.toy;

public class Main {

    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return 0;
            }
        };

        int max = myFunction.max(3, 6);
        System.out.println(max);

    }
}


interface MyFunction {
    public abstract int max(int a, int b);
}
