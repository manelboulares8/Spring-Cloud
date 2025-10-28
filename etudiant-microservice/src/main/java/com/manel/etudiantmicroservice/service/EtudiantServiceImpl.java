package com.manel.etudiantmicroservice.service;

import com.manel.etudiantmicroservice.dto.EtudiantDto;
import com.manel.etudiantmicroservice.entities.Etudiant;
import com.manel.etudiantmicroservice.repos.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements  EtudiantService{
     private EtudiantRepository etudiantRepository;
    @Override
    public EtudiantDto getEtudiantById(Long id) {
        Etudiant etudiant =etudiantRepository.findById(id).get();
        return new EtudiantDto(
                etudiant.getId(),
                etudiant.getNom(),
                etudiant.getPrenom(),
                etudiant.getCin(),
                etudiant.getDateNaissance(),
                etudiant.getClasse(),
                etudiant.getEmail()
        );
     }
}
