package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;


public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -4807748487473705462L;
	private Long id;

    public boolean isNew() {
        return this.id == null;
    }

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
