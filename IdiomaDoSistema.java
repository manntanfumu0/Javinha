import java.util.Locale;


public class IdiomaDoSistema {
    
    public static void main(String[] args) {

        // Obtem o idioma do sistema

        Locale localidade = Locale.getDefault();

          // Exibe o idioma do sistema

        System.out.println("O idioma do sistema é"+ localidade.getDisplayLanguage());
        System.out.println("Código do idioma: " + localidade.getLanguage());
    }
}
