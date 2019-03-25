/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department extends ModelBase {
    private String nameD;
    private String descritionD;
    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Area> areas = new ArrayList<>();
    @OneToOne(optional = false)
    private Company company;

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getNameD() {
        return nameD;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public String getDescritionD() {
        return descritionD;
    }

    public void setDescritionD(String descritionD) {
        this.descritionD = descritionD;
    }
}
