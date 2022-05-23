public class Sample {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        int res = s.add(1,2);
        System.out.println(res);
        int res2 = s.sub(10,5);
        System.out.println(res2);
    }
}
