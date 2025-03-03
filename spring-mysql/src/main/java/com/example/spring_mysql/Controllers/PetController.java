package com.example.spring_mysql.Controllers;


import com.example.spring_mysql.Models.Pet;
import com.example.spring_mysql.Models.PetData;
import com.example.spring_mysql.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    private PetRepository petRepository;


    @Autowired
    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;

    }


    @PostMapping("/populatedb")
    public String seedDB(@RequestParam(required = false) String count){
        int counter;
        counter = count != null ? Integer.parseInt(count) : 5;

        if(count != null){
            counter = Integer.parseInt(count);
        }
        if(petRepository.count() > 0){
            return "Database already has pets";
        }

        List<Pet> pets = new ArrayList<>();
        for(int i = 0; i < counter; i++){
            String randomName  = PetData.getRandomName();
            String randomBreed  = PetData.getRandomBreed();
            Date randomDoB  = PetData.getRandomDoB();
            pets.add(new Pet(randomName,randomBreed,randomDoB));
        }
        petRepository.saveAll(pets);
        return String.format("%s pets added succesfully",count);
    }

    // get pets

    @GetMapping("/")
    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pet> getAllById(@PathVariable("id") Long id){
        return petRepository.findById(id);
    }

    //delete on pets
    @DeleteMapping("")
    public String deletePets(){
        try{
            petRepository.deleteAll();
            return "its all gone";
        }catch(IllegalArgumentException e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    @DeleteMapping("/{id}")
    public void deleteAllById(@PathVariable("id") Long id){
        petRepository.deleteById(id);
    }

}
