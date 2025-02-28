package first_web_api.controller;


import first_web_api.model.User;
import first_web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping("/usuarios")
    public void post(@RequestBody User usuario){
        repository.save(usuario);
    }
    @PutMapping("/usuarios")
    public void put(@RequestBody User usuario){
        repository.update(usuario);
    }
    @GetMapping("/usuarios")
    public List<User> getAll(){
        return repository.listAll();
    }
    @GetMapping("/usuario/{id}")
    public User getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
