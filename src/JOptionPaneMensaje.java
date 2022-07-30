import javax.swing.*;

public class JOptionPaneMensaje {

    public static void main(String[] args) {

        byte numero;
        short numero1;
        int numero2;
        long numero3;

        double decimal;
        float decimal1;

        char letra;
        String cadena;

        numero = Byte.parseByte(JOptionPane.showInputDialog("Ingrese un numero byte"));
        numero1 = Short.parseShort(JOptionPane.showInputDialog("Ingrese un numero short"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        numero3 = Long.parseLong(JOptionPane.showInputDialog("Ingrese un numero long"));


        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número decimal"));
        decimal1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero float"));

        cadena = JOptionPane.showInputDialog("Ingrese una frase");
        letra = JOptionPane.showInputDialog("Ingresa un caracter").charAt(0);

        JOptionPane.showMessageDialog(null, "El numero Byte es: "+numero);
        JOptionPane.showMessageDialog(null, "El numero Short es: "+numero1);
        JOptionPane.showMessageDialog(null, "El numero Int es: "+numero2);
        JOptionPane.showMessageDialog(null, "El numero Long es: "+numero3);

        JOptionPane.showMessageDialog(null, "El numero Double es: "+decimal);
        JOptionPane.showMessageDialog(null, "El numero Float es: "+decimal1);

        JOptionPane.showMessageDialog(null, "La cadena de texto es: "+cadena);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
    }
}
