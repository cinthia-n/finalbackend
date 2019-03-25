/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Area extends ModelBase {
    private String nameA;
    private String descritionA;
    @OneToMany(mappedBy = "area", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Position> positions = new ArrayList<>();
    @OneToOne(optional = false)
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }


    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public String getDescritionA() {
        return descritionA;
    }

    public void setDescritionA(String descritionA) {
        this.descritionA = descritionA;
    }
}
