/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.model.Area;
import edu.umss.dip.ssiservice.repositories.AccidentRepository;
import edu.umss.dip.ssiservice.repositories.AreaRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl extends GenericServiceImpl<Area> implements AreaService {
    private final AreaRepository repository;

    public AreaServiceImpl(AreaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Area> getRepository() {
        return repository;
    }
}
