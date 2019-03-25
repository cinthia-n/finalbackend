/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.model.Position;
import edu.umss.dip.ssiservice.repositories.AccidentRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.PositionRepository;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl extends GenericServiceImpl<Position> implements PositionService {
    private final PositionRepository repository;

    public PositionServiceImpl(PositionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Position> getRepository() {
        return repository;
    }
}
