import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double a,b,c,u,alan;
        Scanner input=new Scanner(System.in);
        System.out.println("Üçgenin ilk kenarını girin:");
        a=input.nextDouble();
        System.out.println("Üçgenin ikinci kenarını girin:");
        b=input.nextDouble();
        System.out.println("Üçgenin üçüncü kenarını girin:");
        c=input.nextDouble();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı="+alan);
    }
}
