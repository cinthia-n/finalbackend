/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company extends ModelBase {
    private String nameCompany;
    private String descritionCompany;
    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Department> departments = new ArrayList<>();

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getDescritionCompany() {
        return descritionCompany;
    }

    public void setDescritionCompany(String descritionCompany) {
        this.descritionCompany = descritionCompany;
    }
}
