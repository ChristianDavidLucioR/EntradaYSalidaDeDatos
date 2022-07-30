import java.util.Scanner;

public class SystemOutPrintl {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                            ***Pidiento datos al Usuario***");
        System.out.println("Tipos de datos primitivos enteros\n");

        Scanner Byte = new Scanner(System.in);
        byte numero1;
        System.out.print("Ingresa un número de tipo byte entre el rango -128 y 127: ");
        numero1 = Byte.nextByte();
        System.out.println("El numero es: "+numero1+ "\n");

        Scanner Short = new Scanner(System.in);
        Short numero2;
        System.out.print("Ingrese un numero de tipo short entre el rango -32768 y 32767: ");
        numero2 = Short.nextShort();
        System.out.println("El numero es: "+numero2+ "\n");

        Scanner Int = new Scanner(System.in);
        int numero3;
        System.out.print("Ingresa un numero tipo entero: ");
        numero3 = Int.nextInt();
        System.out.println("El numero es: "+numero3+ "\n");

        Scanner Long = new Scanner(System.in);
        long numero4;
        System.out.print("Ingrese un numero tipo long: ");
        numero4 = Long.nextLong();
        System.out.println("El numero es: "+numero4);
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("                            Tipos de datos Decimales");

        Scanner Float = new Scanner(System.in);
        float numero5;
        System.out.print("Ingrese un numero tipo float: ");
        numero5 = Float.nextFloat();
        System.out.println("El numero ingresado es: "+numero5+ "\n");

        Scanner Double = new Scanner(System.in);
        double numero6;
        System.out.print("Ingrese un numero tipo double: ");
        numero6 = Double.nextDouble();
        System.out.println("El numero ingresado es: "+numero6);
        System.out.println("------------------------------------------------------------------------------------------");



        System.out.println("                            Cadena de texto");

        Scanner String1 = new Scanner(System.in);
        String palabra;
        System.out.print("Ingrese una palabra: ");
        palabra = String1.next(); //EL NEXT SOLO IMPREME LA PRIMERA PALABRA INGRESADA Y NO TODA LA FRASE
        System.out.println("la palabra que ingreso es: "+palabra);

        Scanner String2 = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase de texto: ");
        frase = String2.nextLine();
        System.out.println("La frase ingresada es: "+frase);
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("                            CARACTERES");

        Scanner Caracter = new Scanner(System.in);
        char letra;
        System.out.print("Ingrese un caracter: ");
        letra = Caracter.next().charAt(0);
        System.out.println("El caracter ingresado es: "+letra);
        System.out.println("------------------------------------------------------------------------------------------");

    }
}
