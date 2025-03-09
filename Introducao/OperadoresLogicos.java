public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        // Tabela Verdade
        // Operador E (&&)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador OU (||)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // Operador NÃO (!)
        // !true = false
        // !false = true

        String mensagem = fimDeSemana ? "É fim de semana!" : "Não é fim de semana!";
        System.out.println(mensagem);



    }
}
