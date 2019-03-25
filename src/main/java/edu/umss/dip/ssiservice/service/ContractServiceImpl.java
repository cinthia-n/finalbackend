/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Contract;
import edu.umss.dip.ssiservice.model.Employee;
import edu.umss.dip.ssiservice.repositories.ContractRepository;
import edu.umss.dip.ssiservice.repositories.EmployeeRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class ContractServiceImpl extends GenericServiceImpl<Contract> implements ContractService {
    private final ContractRepository repository;

    public ContractServiceImpl(ContractRepository repository) {
        this.repository = repository;
    }



    @Override
    protected GenericRepository<Contract> getRepository() {
        return repository;
    }
}
