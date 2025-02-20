package decola_tech.aulaJPA;

import decola_tech.aulaJPA.model.User;
import decola_tech.aulaJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repositorio;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Miguel");
        user.setUsername("Pnext");
        user.setPassword("123415");

        repositorio.save(user);

        for(User u: repositorio.findAll()){
            System.out.println(u);
        }

    }
}