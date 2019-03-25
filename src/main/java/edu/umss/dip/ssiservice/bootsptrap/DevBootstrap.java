

package edu.umss.dip.ssiservice.bootsptrap;

import edu.umss.dip.ssiservice.model.*;
import edu.umss.dip.ssiservice.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private CategoryRepository categoryRepository;
    private SubCategoryRepository subCategoryRepository;
    private ItemRepository itemRepository;
    private EmployeeRepository employeeRepository;
    private PositionRepository positionRepository;
    private ContractRepository contractRepository;
    private AccidentRepository accidentRepository;


    public DevBootstrap(CategoryRepository categoryRepository, SubCategoryRepository subCategoryRepository,
            ItemRepository itemRepository, EmployeeRepository employeeRepository,
            PositionRepository positionRepository, ContractRepository contractRepository, AccidentRepository accidentRepository) {
        this.categoryRepository = categoryRepository;
        this.subCategoryRepository = subCategoryRepository;
        this.itemRepository = itemRepository;
        this.employeeRepository = employeeRepository;
        this.positionRepository = positionRepository;
        this.contractRepository = contractRepository;
        this.accidentRepository = accidentRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        // EPP category
        Category eppCategory = new Category();
        eppCategory.setCode("EPP");
        eppCategory.setName("EPP");
        categoryRepository.save(eppCategory);

        // RES category
        Category resourceCategory = new Category();
        resourceCategory.setCode("RES");
        resourceCategory.setName("RESOURCE");
        categoryRepository.save(resourceCategory);

        // safety subcategory
        SubCategory safetySubCategory = new SubCategory();
        safetySubCategory.setCategory(eppCategory);
        safetySubCategory.setCode("SAF");
        safetySubCategory.setName("SAFETY");
        subCategoryRepository.save(safetySubCategory);

        // raw material subcategory
        SubCategory rawMaterialSubCategory = new SubCategory();
        rawMaterialSubCategory.setCategory(resourceCategory);
        rawMaterialSubCategory.setCode("RM");
        rawMaterialSubCategory.setName("RAW MATERIAL");
        subCategoryRepository.save(rawMaterialSubCategory);

        // Helmet Item
        Item helmet = new Item();
        helmet.setCode("HEL");
        helmet.setName("HELMET");
        helmet.setSubCategory(safetySubCategory);
        itemRepository.save(helmet);

        // ink Item
        Item ink = new Item();
        ink.setCode("INK");
        ink.setName("INK");
        ink.setSubCategory(rawMaterialSubCategory);
        itemRepository.save(ink);

        // John Employee
        Employee john = new Employee();
        john.setFirstName("John");
        john.setLastName("Doe");
        john.setCI("6578493 CBA");
        john.setAddress("av blanco galindo klm 3");
        john.setProfession("tecnico en construccion civil");
        john.setTelephone("67893544");

        Employee fernando = new Employee();
        fernando.setFirstName("Fernando");
        fernando.setLastName("Villarroel");
        fernando.setCI("7865439 CBA");
        fernando.setAddress("sacaba");
        fernando.setProfession("Electricista");
        fernando.setTelephone("78954321");

        // Position
        Position position = new Position();
        position.setName("OPERATIVE");
        positionRepository.save(position);

        // contract
        Contract contract = new Contract();
        contract.setEmployee(john);
        contract.setInitDate(new Date(2010, 1, 1));
        contract.setPosition(position);
        contract.setDescriptionContract("Encargado de supervisar las obras");


        john.getContracts().add(contract);
        employeeRepository.save(john);
        //contractRepository.save(contract);

        Accident accident = new Accident();
        accident.setDescription("fractura de clavicula por caida");
        accident.setEmployee(john);
        accident.setDate(new Date(2010, 1, 1));

        Contract contract1 = new Contract();
        contract1.setEmployee(john);
        contract1.setPosition(position);
        contract1.setTitleContract("OPERATIVE");
        contract1.setDescriptionContract("Responsable de verificar las obras");

    }
}
