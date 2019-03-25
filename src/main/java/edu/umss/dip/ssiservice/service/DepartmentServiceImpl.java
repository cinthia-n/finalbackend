/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.model.Department;
import edu.umss.dip.ssiservice.repositories.AccidentRepository;
import edu.umss.dip.ssiservice.repositories.DepartmentRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends GenericServiceImpl<Department> implements DepartmentService{
    private final DepartmentRepository repository;

    public DepartmentServiceImpl(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Department> getRepository() {
        return repository;
    }
}
