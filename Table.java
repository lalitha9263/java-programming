import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println("enter the value of n");
        scn.close();
        for(int i=1;i<=10;i++){
            System.out.println(n + "X" + i + "=" + (n*i));
        }   
    }
    
}
