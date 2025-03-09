public class operadoresLogicos {

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


    }
}
