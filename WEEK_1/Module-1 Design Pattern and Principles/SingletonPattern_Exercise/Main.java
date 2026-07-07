public class Main {
     public static void main(String args[]){
        Logger s1=Logger.getInstance();
        Logger s2=Logger.getInstance();
        System.out.println(s1 == s2);
    }
}
