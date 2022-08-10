import java.util.Scanner;

public class Main {


    public static main(String[] args)
    {


    }

    public static double calcularTriangulo()
    {
        double res;
        Scanner en= new Scanner(System.in);
        System.out.println("Base: ");   int base = en.nextInt();
        System.out.println("Altura: ");   int Altura = en.nextInt();
        res =base * Altura/2;
        return res;

    }
    public static double calcularCuadrado()
    {
        double res;
        Scanner en= new Scanner(System.in);
        System.out.println("Lado: ");   
        int lado = en.nextInt();
        res =Math.pow(lado,2 );
        
        return res;

    }
    public static double calcularRectangulo()
    {
        double res;
        Scanner en= new Scanner(System.in);
        System.out.println("Base: ");   int base = en.nextInt();
        System.out.println("Altura: ");   int Altura = en.nextInt();
        res =base * Altura;
        return res;

    }



    
}