package com.kunal.firstjobapp.company;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl  implements  CompanyService{
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Company company, Long id) {
        Optional<Company> companyOptional=companyRepository.findById(id);

        if(companyOptional.isPresent())
        {
            Company companyToUpdate=companyOptional.get();
            companyToUpdate.setDescription(companyToUpdate.getDescription());
            companyToUpdate.setName(companyToUpdate.getName());
            companyToUpdate.setJobs(companyToUpdate.getJobs());
            companyRepository.save(companyToUpdate);
            return true;
        }

        return false;
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public boolean deleteCompany(Long id) {

        try {
            companyRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public Company getById(Long companyId) {
        Company company=companyRepository.findById(companyId).orElse(null);
        return company;
    }


}
