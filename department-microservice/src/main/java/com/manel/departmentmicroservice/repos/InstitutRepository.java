package com.manel.departmentmicroservice.repos;

import com.manel.departmentmicroservice.entities.Institut;
import  org.springframework.data.jpa.repository.JpaRepository;
public interface InstitutRepository  extends JpaRepository<Institut,
        Long> {
    Institut findInstitutByIdI(long idI);
}