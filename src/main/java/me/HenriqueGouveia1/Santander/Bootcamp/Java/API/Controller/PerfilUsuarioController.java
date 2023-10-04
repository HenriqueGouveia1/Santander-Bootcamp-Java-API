package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Controller;

import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.PerfilUsuario;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perfilUsuario")
public class PerfilUsuarioController {

    private  final UserService us;

    public PerfilUsuarioController(UserService us) {
        this.us = us;
    }

    //usar por facilidade o PerfilUsuario mas por melhor pratica seria utilizar um user DTO mais correto e seguro
    @GetMapping("/{id}")
    public ResponseEntity<PerfilUsuario> findById(@PathVariable Long id){
        var pU = us.findById(id);
        return ResponseEntity.ok(pU);
    }

    @PostMapping
    public ResponseEntity<PerfilUsuario> create(@RequestBody PerfilUsuario perfilUsuario){
        var created = us.create(perfilUsuario);
        return ResponseEntity.ok(created);
    }
}
