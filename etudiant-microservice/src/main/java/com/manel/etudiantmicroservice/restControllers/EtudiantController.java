package com.manel.etudiantmicroservice.restControllers;
import com.manel.etudiantmicroservice.dto.EtudiantDto;
import com.manel.etudiantmicroservice.service.EtudiantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/etudiants")
@AllArgsConstructor
public class EtudiantController {
    private EtudiantService etudiantService;
    @GetMapping("{id}")
    public ResponseEntity<EtudiantDto> getEtudiant(@PathVariable ("id")Long id){
        return new ResponseEntity<EtudiantDto>(
                etudiantService.getEtudiantById(id),HttpStatus.OK);

    }

}
