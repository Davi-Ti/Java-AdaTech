import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Funcoes {

    public static void main(String[] args) {
        String nome = "Davi";
        String diaSemana = Data.diaSemana();
        String saudacao = Data.saudacao(nome, diaSemana);

        System.out.println(saudacao);

        
    }

    public static class Data {
        public static String diaSemana() {
            LocalDate hoje = LocalDate.now();
            Locale brasil = Locale.forLanguageTag("pt-BR");
            return hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        }

        public static String saudacao( String nome, String diaSemana) {   {
            LocalDateTime agora = LocalDateTime.now();
            int hora = agora.getHour();
            String saudacao;
            if (hora < 12) {
                saudacao = "Bom dia";
            } else if (hora < 18) {
                saudacao = "Boa tarde";
            } else {
                saudacao = "Boa noite";
            }
            
            return "Olá, " + nome + "! " + saudacao + " hoje é " + diaSemana;
            
        }
    }
}}