package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Controller;

import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.BarItem;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.PerfilUsuario;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Service.BarItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BarItem")
public class BarItemController {


    private  final BarItemService bs;

    public BarItemController(BarItemService bs) {
        this.bs = bs;
    }


    //usar por facilidade o PerfilUsuario mas por melhor pratica seria utilizar um user DTO mais correto e seguro
    @GetMapping("/{id}")
    public ResponseEntity<BarItem> findById(@PathVariable Long id){
        var bI = bs.findById(id);
        return ResponseEntity.ok(bI);
    }

    @PostMapping
    public ResponseEntity<BarItem> create(@RequestBody BarItem barItem){
        var created = bs.create(barItem);
        return ResponseEntity.ok(created);
    }
}

