package calculadora;

/**
 * <p>
 * <strong> Teste Funcional da Calculadora </strong>
 * </p>
 * 
 * <p>
 * Esta classe valida o funcionamento do método {@link Calculadora#calcular},
 * responsável por executar operações matemáticas com base em um operador.
 * </p>
 * 
 * <p>
 * Os testes seguem a abordagem de <strong>caixa preta</strong>, verificando
 * entradas e saídas esperadas.
 * </p>
 * 
 * <p>
 * Também são testados cenários de erro, como divisão por zero
 * e operador inválido.
 * </p>
 * 
 * @author Murilo
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal responsável por executar os testes.
     * 
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("=== TESTES FUNCIONAIS (MÉTODO CALCULAR) ===");

        /**
         * Teste de soma utilizando o método calcular.
         * Entrada: 2 + 3
         * Saída esperada: 5
         */
        int soma = calc.calcular(2, 3, "+");
        System.out.println("Somar (2 + 3): " + soma);

        /**
         * Teste de subtração utilizando o método calcular.
         * Entrada: 10 - 4
         * Saída esperada: 6
         */
        int sub = calc.calcular(10, 4, "-");
        System.out.println("Subtrair (10 - 4): " + sub);

        /**
         * Teste de multiplicação utilizando o método calcular.
         * Entrada: 3 * 5
         * Saída esperada: 15
         */
        int mult = calc.calcular(3, 5, "*");
        System.out.println("Multiplicar (3 * 5): " + mult);

        /**
         * Teste de divisão utilizando o método calcular.
         * Entrada: 8 / 2
         * Saída esperada: 4
         */
        int div = calc.calcular(8, 2, "/");
        System.out.println("Dividir (8 / 2): " + div);

        /**
         * Teste de exceção: divisão por zero.
         * Entrada: 8 / 0
         * Saída esperada: exceção IllegalArgumentException
         */
        try {
            calc.calcular(8, 0, "/");
            System.out.println("Erro: divisão por zero não foi tratada");
        } catch (IllegalArgumentException e) {
            System.out.println("Divisão por zero tratada corretamente: " + e.getMessage());
        }

        /**
         * Teste de exceção: operador inválido.
         * Entrada: 5 % 2
         * Saída esperada: exceção IllegalArgumentException
         */
        try {
            calc.calcular(5, 2, "%");
            System.out.println("Erro: operador inválido não foi tratado");
        } catch (IllegalArgumentException e) {
            System.out.println("Operador inválido tratado corretamente: " + e.getMessage());
        }

        System.out.println("=== FIM DOS TESTES ===");
    }
}