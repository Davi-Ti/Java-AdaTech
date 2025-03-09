import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Funcoes {

    public static void main(String[] args) {
        String nome = "Davi";
        String diaSemana = Data.diaSemana();
        String saudacao = Data.saudacao();

        System.out.printf("Olá %s, hoje é %s. %s!%n", nome, diaSemana, saudacao);
    }

    public static class Data {
        public static String diaSemana() {
            LocalDate hoje = LocalDate.now();
            Locale brasil = Locale.forLanguageTag("pt-BR");
            return hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        }

        public static String saudacao() {
            LocalDateTime agora = LocalDateTime.now();
            int hora = agora.getHour();
            if (hora < 12) {
                return "Bom dia";
            } else if (hora < 18) {
                return "Boa tarde";
            } else {
                return "Boa noite";
            }
        }
    }
}