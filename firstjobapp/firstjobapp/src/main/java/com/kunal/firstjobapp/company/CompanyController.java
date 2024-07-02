package com.kunal.firstjobapp.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private CompanyService companyService;
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable Long id,@RequestBody Company company){
        companyService.updateCompany(company,id);
        return new ResponseEntity<>("updated", HttpStatus.OK);

    }
    @PostMapping
    public String addCompany(@RequestBody Company company){
        companyService.createCompany(company);
        return  "Job created success";
    }

    @GetMapping("/{companyId}")
    public Company getById(@PathVariable Long companyId){
        return companyService.getById(companyId);
    }
    @DeleteMapping("/{companyId}")
    public String deleteCompanyById(@PathVariable Long companyId){
        boolean isDeleted=companyService.deleteCompany(companyId);
        if(isDeleted) {
            return "company deleted";
        }
        return "Company not deleted";
    }


}
