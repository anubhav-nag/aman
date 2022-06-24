class SampleClass{
    private int a,b;
    public void call(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println(a+b);
    }
}

public class amanS {
    public static void main(String[] args) {
        SampleClass m = new SampleClass();
        m.call(12,25);
    }
}