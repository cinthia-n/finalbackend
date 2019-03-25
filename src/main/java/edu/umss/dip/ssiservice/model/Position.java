/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Position extends ModelBase {
    private String name;
    private String descrition;
    @OneToMany(mappedBy = "position", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Contract> contracts = new ArrayList<>();
    @OneToOne
    private Area area;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
