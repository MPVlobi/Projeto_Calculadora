/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

public class calculadora {

    public int r = 0;

    public int calc(int a, int b, String op) {
        if (op.equals("+")) {
            r = a + b;
        } else if (op.equals("-")) {
            r = a - b;
        } else if (op.equals("*")) {
            r = a * b;
        } else if (op.equals("/")) {
            if (b != 0) {
                r = a / b;
            } else {
                System.out.println("Erro: divisao por zero, operação irregular");
                r = 0;
            }

        } else {
            System.out.println("Operação invalida");
            r = 0;
        }
        System.out.println("Resultado = " + r);

        return r;
    }
}