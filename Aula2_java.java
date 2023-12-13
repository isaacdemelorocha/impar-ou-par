/*Aula02-Exercicio Isaac 21404*/
package aula2_java;
import java.util.Scanner;
public class Aula2_java {
    public static void main(String[] args) {
    int num;
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Digite um número: ");
    num = sc1.nextInt();
    
    if(num % 2==0){
        System.out.println(num +" é par");
        }
    else{
   System.out.println(num +" é impar");     
     }
    }//Fim
}//Não apagar