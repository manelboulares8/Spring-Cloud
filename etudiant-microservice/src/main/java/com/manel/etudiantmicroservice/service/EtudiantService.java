package com.manel.etudiantmicroservice.service;

import com.manel.etudiantmicroservice.dto.EtudiantDto;

public interface EtudiantService {
    EtudiantDto getEtudiantById(Long id);
}
