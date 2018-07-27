package entity;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Dog.findPlayed", query = "SELECT p FROM Dog p WHERE p.played=?1")
public class Dog extends Animal{

    private Type type;
    private boolean played;

    public void setType(){
        this.type=Type.MAMMALS;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }


}
