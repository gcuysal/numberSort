import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int num1, num2, num3 ;
        int a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        num1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        num2 = inp.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        num3 = inp.nextInt();

        if ((num1 > num2) && (num1 > num3)){
            if (num2>num3){
                System.out.println(num1+">"+num2+">"+num3);
            }else {
                System.out.println(num1+">"+num3+">"+num2);
            }
        }else if ((num2 >num1) && (num2>num3) ){
            if (num1>num3){
                System.out.println(num2+">"+num1+">"+num3);
            }else {
                System.out.println(num2+">"+num3+">"+num1);
            }
        }else {
            if(num2>num1){
                System.out.println(num3+">"+num2+">"+num1);
            }else {
                System.out.println(num3+">"+num1+">"+num2);
            }
        }

    }
}
