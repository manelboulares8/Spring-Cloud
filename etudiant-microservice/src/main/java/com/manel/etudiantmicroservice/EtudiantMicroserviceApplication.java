package com.manel.etudiantmicroservice;

import com.manel.etudiantmicroservice.entities.Etudiant;
import com.manel.etudiantmicroservice.repos.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EtudiantMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtudiantMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository){
        return args ->{
            etudiantRepository.save(Etudiant.builder()
                    .cin(12345678)
                    .nom("boulres")
                    .prenom("manel")
                    .classe("DSI33")
                    .dateNaissance("1 octobre")
                    .build());
        };
    }
}
