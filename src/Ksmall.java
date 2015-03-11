//Kth smallest element...
public class Ksmall {
    public void test(int count){
        if(count>5)
        { System.out.println(count);}
        System.out.println(count);
        ++count;
        System.out.println(count);
        if(count<5) {
                System.out.println("Not valid");
                System.out.println(count);
                }
    }
    public static void main(String[] args) {
        int count=5;
        Ksmall t= new Ksmall();
        t.test(count);
    }
    
}
