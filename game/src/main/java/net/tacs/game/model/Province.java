package net.tacs.game.model;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Entity
//@Table(name = "province")
public class Province {

//    @Id
//    @GeneratedValue
    private Long id;

	private String name;
//    @OneToMany(cascade = {CascadeType.ALL})
    private List<Municipality> municipalities = new ArrayList<>();

	private Centroide centroide;

	public Province() {
        this.id = new SecureRandom().nextLong();
	}
	
	public Province(String name) {
        this.id = new SecureRandom().nextLong();
		this.name = name;
	}


	public Long getId() {
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}


	public Centroide getCentroide() {
		return centroide;
	}

	public void setCentroide(Centroide centroide) {
		this.centroide = centroide;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
    }

    public List<Municipality> getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(List<Municipality> municipalities) {
        this.municipalities = municipalities;
	}

	public void addMunicipality(Municipality municipality){ this.municipalities.add(municipality);}

	@Override
	public String toString() {
		return "Province{" + "name='" + name + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Province province = (Province) o;
		return Objects.equals(name, province.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
