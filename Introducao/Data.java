import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.time.format.TextStyle;

public class Data {

    public static void main(String[] args) {
        String nome = "Davi";
        
        LocalDate hoje = LocalDate.now();
        Locale brasil = Locale.forLanguageTag("pt-BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        int hora = agora.getHour();
        if (hora < 12) {
            saudacao = "Bom dia";
        } else if (hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        System.out.printf("Olá %s, hoje é %s, %s\n", nome, diaSemana, saudacao);

    }

}
