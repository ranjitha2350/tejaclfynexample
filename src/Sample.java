public class Sample {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        int res = s.add(1,2);
        System.out.println(res);
    }
}
