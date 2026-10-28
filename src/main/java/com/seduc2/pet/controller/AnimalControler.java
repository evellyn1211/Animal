package com.seduc2.pet.controller;

import com.seduc2.pet.intity.Animal;
import com.seduc2.pet.repository.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class AnimalControler {

   private final AnimalService service;
    public AnimalControler(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> mostrarAnimal(){
        return service.mostraranimais();
    }
    @PostMapping
    public void criarAnimal(@RequestBody Animal a){
        service.cadastrarAnimal(a);
    }
}
