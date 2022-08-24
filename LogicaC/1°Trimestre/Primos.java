import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
                Scanner bernardo = new Scanner(System.in);
                System.out.println(Digite um número!);
                int n = bernardo.nextInt();
                int i = 1;
                int a = 0; 
                while(i <= n){
                    if(n % i == 0){
                        a++;
                    }
                    i++;
                }
                if(a == 2) {
                    System.out.println(Esse número é primo);
                } 
        }
}

