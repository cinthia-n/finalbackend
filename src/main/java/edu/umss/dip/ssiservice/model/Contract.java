/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.DtoBase;
import org.modelmapper.ModelMapper;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Contract extends ModelBase {
    @OneToOne(optional = false)
    private Employee employee;
    @OneToOne(optional = false)
    private Position position;
    private String titleContract;
    private String descriptionContract;
    private Date initDate;
    private Date endDate;


    public String getTitleContract() {
        return titleContract;
    }

    public void setTitleContract(String titleContract) {
        this.titleContract = titleContract;
    }

    public String getDescriptionContract() {
        return descriptionContract;
    }

    public void setDescriptionContract(String descriptionContract) {
        this.descriptionContract = descriptionContract;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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




}
