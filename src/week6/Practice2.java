package week6;


public class Practice2 {

    public static void main(String[] args) {
        int i=0;

        for (; i<=50; i++){
            if(i==5 || i==25){
                continue;
            }
            if(i==49){
                break;
            }
            System.out.println(i);
        }
    }
}