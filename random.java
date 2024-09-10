public class  random{

    public static void main(String[] args) {
        int x=(int)(Math.random()*101);
        System.out.println(x);
        String c=(x>50)? "Hiii":"Bye";
        System.out.println(c);
    }
    }