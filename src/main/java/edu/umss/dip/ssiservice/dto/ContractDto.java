package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Contract;
import edu.umss.dip.ssiservice.model.Employee;
import edu.umss.dip.ssiservice.model.Position;
import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class ContractDto extends DtoBase<Contract> {
    private String titleContract;
    private String descriptionContract;
    private Date initDate;
    private Date endDate;
    private String nameE;
    private String CiE;
    private Long employeID;

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getCiE() {
        return CiE;
    }

    public void setCiE(String ciE) {
        CiE = ciE;
    }

    public Long getEmployeID() {
        return employeID;
    }

    public void setEmployeID(Long employeID) {
        this.employeID = employeID;
    }

    public String getDescriptionContract() {
        return descriptionContract;
    }

    public void setDescriptionContract(String descriptionContract) {
        this.descriptionContract = descriptionContract;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTitleContract() {
        return titleContract;
    }

    public void setTitleContract(String titleContract) {
        this.titleContract = titleContract;
    }

    @Override
    public DtoBase toDto(Contract element, ModelMapper mapper){
        super.toDto(element, mapper);
        setEmployeID(element.getEmployee().getId());
        return this;
    }
}