public class Sample {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        int res = s.add(1,2);
        System.out.println(res);
        int res2 = s.sub(10,5);
        System.out.println(res2);
        int res3 = s.mul(3,2);
        System.out.println(res3);
        int res4 = s.div(12,2);
        System.out.println(res4);
    }
}
