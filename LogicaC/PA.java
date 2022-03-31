import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	    Scanner pedro = new Scanner(System.in);
	    System.out.println(Digite qual variável quer calcular:);
	    System.out.println(1 para An, 2 para A1, 3 para r, 4 para N);
	    
	    int resposta = pedro.nextInt();
	    
	    //1
	    if(resposta == 1){ 
	         System.out.println(Digite o valor de a1:);
	         int a1 = pedro.nextInt();
	         System.out.println(Digite o valor de r:);
	         int r = pedro.nextInt();
	         System.out.println(Digite o valor de n:);
	         int n = pedro.nextInt();
	         int an = a1 + (n-1) *r;
	         System.out.println(O resultado de an é: +an);
	    }
	    //2
	    else if (resposta == 2){
	         System.out.println(Digite o valor de an:);
	         int an = pedro.nextInt();
	         System.out.println(Digite o valor de r:);
	         int r = pedro.nextInt();
	         System.out.println(Digite o valor de n:);
	         int n = pedro.nextInt();
	         int a1 = an-(n-1)*r;
	         System.out.println(O resultado de a1 é: +a1);
        }
        //3
        else if (resposta == 3){
	         System.out.println(Digite o valor de an:);
	         int an = pedro.nextInt();
	         System.out.println(Digite o valor de a1:);
	         int a1 = pedro.nextInt();
	         System.out.println(Digite o valor de n:);
	         int n = pedro.nextInt();
	         int r = (an-a1)/(n-1);
	         System.out.println(O resultado de r é: +r);
        }
        //4
        else if (resposta == 4){
	         System.out.println(Digite o valor de an:);
	         int an = pedro.nextInt();
	         System.out.println(Digite o valor de a1:);
	         int a1 = pedro.nextInt();
	         System.out.println(Digite o valor de r:);
	         int r = pedro.nextInt();
	         int n = ((an-a1)/r)+1;
	         System.out.println(O resultado de r é: +n);
    }
  }
}

