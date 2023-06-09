package guru.springframework.sfgpetclinic.model;

public class Speciality extends BaseEntity {
    private static final long serialVersionUID = -8123327384575186995L;
	private String description;

    public Speciality() {
    }

    public Speciality(String description) {
        this.description = description;
    }

    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
