package entity;

import javax.persistence.*;
import java.util.List;

@Entity
//@NamedQuery(name = "Human.findOfName", query = "SELECT p FROM Human p WHERE p.name='Mihai1'")
@NamedQuery(name = "Human.findOfAnimal", query = "SELECT p.animalList FROM Human p WHERE p.age>:age1")
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Animal> animalList;

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
