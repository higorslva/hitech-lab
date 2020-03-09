import java.util.Scanner;

public class Raizes
{
    public static void main (String [] args) 
    {
        int a, b, c;
        double x1, x2, delta;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Calculadora de raizes das funções ax² + bx + c");
        System.out.println("Insira o valor de a: ");
        a = ler.nextInt();

        System.out.println("Insira o valor de b: ");
        b = ler.nextInt();

        System.out.println("Insira o valor de c: ");
        c = ler.nextInt();
        
        delta = (b*b-4*a*c);
        
        x1 = ((-b + Math.sqrt(delta))/2*a);
        x2 = ((-b - Math.sqrt(delta))/2*a);

        System.out.println("As raízes de x² + " + b + "x + " + c + " são: ");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}