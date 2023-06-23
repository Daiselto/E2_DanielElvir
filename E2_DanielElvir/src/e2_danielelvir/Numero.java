/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2_danielelvir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Numero {
    private int base;
    private String numero;
    private int decimal;
    
    public Numero(int base, int decimal){
    this.base=base;
    this.numero=decToBase(decimal);
    this.decimal=decimal;
}
    
     public int getBase() {
        return this.base;
    }

    public String getNumero() {
        return this.numero;
    }
    
    public int getDecimal(){
        return this.decimal;
    }
    
     public String numToChar(int numero) {
        if (numero >= 0 && numero <= 9) {
            return String.valueOf(numero);
        } else if (numero >= 10 && numero <= 35) {
            char c = (char) (numero + 87);
            return String.valueOf(c);
        } else {
            return null;
        }
    }

    public int charToNum(char c) {
        if (Character.isDigit(c)) {
            return Character.getNumericValue(c);
        } else if (Character.isLetter(c)) {
            int num = Character.toLowerCase(c) - 87;
            if (num >= 10 && num <= 35) {
                return num;
            }
        }
        return -1;
    }

    public String decToBase(int decimal) {
        String resultado = "";
        int cociente = decimal;

        while (cociente != 0) {
            int residuo = cociente % base;
            String digit = numToChar(residuo);
            if (digit == null) {
                return null;
            }
            resultado = digit + resultado;
            cociente = cociente / base;
        }

        return resultado;
    }

    public int baseToDec(String numero) {
        int decimal = 0;
        int exponente = 0;

        for (int i = numero.length() - 1; i >= 0; i--) {
            char c = numero.charAt(i);
            int valor = charToNum(c);
            if (valor == -1) {
                return -1;
            }
            decimal += valor * Math.pow(base, exponente);
            exponente++;
        }

        return decimal;
    }

    
}
