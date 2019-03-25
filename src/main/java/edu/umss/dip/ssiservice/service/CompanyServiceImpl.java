/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.model.Company;
import edu.umss.dip.ssiservice.repositories.AccidentRepository;
import edu.umss.dip.ssiservice.repositories.CompanyRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl extends GenericServiceImpl<Company> implements CompanyService {
    private final CompanyRepository repository;

    public CompanyServiceImpl(CompanyRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Company> getRepository() {
        return repository;
    }
}
