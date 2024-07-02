package com.kunal.firstjobapp.company;

import java.util.List;
import java.util.Optional;

public interface CompanyService{
    List<Company> getAllCompanies();
    boolean updateCompany(Company company,Long id);
    void createCompany(Company company);
    boolean deleteCompany(Long id);
    Company getById(Long companyId);
}
