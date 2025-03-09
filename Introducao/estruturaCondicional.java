public class estruturaCondicional {

    public static void main(String[] args) {
        int nota = 70;

        if (nota >= 70) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        //A 80 B 70 C 60 D 0
        String graduacao;

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota >= 70) {
            graduacao = "B";
        } else if (nota >= 60) {
            graduacao = "C";
        } else {
            graduacao = "D";
        }

        switch (graduacao) {
            case "A" -> System.out.println("Parabéns!");
            case "B" -> System.out.println("Quase lá!");
            case "C" -> System.out.println("Estude mais!");
            case "D" -> System.out.println("Reprovado!");
            default -> System.out.println("Nota inválida!");
        }


    }

}
