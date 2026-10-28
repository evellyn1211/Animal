package com.seduc2.pet.repository.service;

import com.seduc2.pet.intity.Animal;
import com.seduc2.pet.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {


  private final  AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }
    public List<Animal> mostraranimais(){
        List<Animal> animalList = repository.findAll();
        return animalList = repository.findAll();
    }

    public void cadastrarAnimal(Animal animation){
        Animal animal = new Animal();
        animal.setNome(animation.getNome());
        animal.setCastrado(animation.isCastrado());
        animal.setEspecie(animation.getEspecie());
        animal.setRaca(animation.getRaca());
        animal.setSexo(animal.getSexo());
        animal.setDataNascimento(animation.getDataNascimento());
        animal.setPeso(animation.getPeso());
        animal.setCor(animation.getCor());
        animal.setVacinacao(animation.getVacinacao());
        animal.setObservacao(animation.getObservacao());
        repository.save(animal);
    }

}
