/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.AccidentDto;
import edu.umss.dip.ssiservice.dto.ContractDto;
import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.model.Contract;
import edu.umss.dip.ssiservice.service.AccidentService;
import edu.umss.dip.ssiservice.service.ContractService;
import edu.umss.dip.ssiservice.service.EmployeeService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/contracts")
@Produces(MediaType.APPLICATION_JSON)
public class ContractController extends GenericController<Contract, ContractDto> {
    private ContractService service;
    private EmployeeService employeeService;

    public ContractController(ContractService service, EmployeeService employeeService) {
        this.service = service;
        this.employeeService = employeeService;
    }

    @Override
    @GET
    public List<ContractDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Contract toModel(ContractDto dto) {
        Contract contract = super.toModel(dto);

        contract.setEmployee(employeeService.findById(dto.getEmployeID()));
        return contract;
    }
}