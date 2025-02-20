package dio.mensagem_sistema.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${nome}")
    private String nome;

    @Value("${email}")
    private String email;

    @Value("${telefones}")
    private List<Long> telefones =
            new ArrayList<>(Arrays.asList(new Long[]{119543214L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nE-mail: " + email
                + "\nTelefones:" + telefones);
        System.out.println("Seu cadastro foi aprovado!");
    }
}
/** Meu amigo o que deu de erro nesse Value é brincadeira.**/

