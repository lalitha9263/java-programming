import java.util.Scanner;
public class Multiplication{
public static void Multiple(int n,int m){
    for(int i=1;i<=100;i++){
        if(i%n==0 && i%m==0){
            System.out.println(i);

        }
    }
}
public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    System.out.println("enter first number");
    int m=scn.nextInt();
    System.out.println("enter second number"); 
    scn.close();
    Multiple(n,m);
}
}
