package com.manel.departmentmicroservice.restControllers;

import com.manel.departmentmicroservice.dto.InstitutDto;
import com.manel.departmentmicroservice.service.InstitutService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/ins")
@AllArgsConstructor
public class InstitutController {
    private InstitutService institutService;

    @GetMapping("{id}")
    public ResponseEntity<InstitutDto> getInsById(@PathVariable ("id")long id){
        return new ResponseEntity<InstitutDto>(
                institutService.getInstitutById(id),HttpStatus.OK);}

    }



