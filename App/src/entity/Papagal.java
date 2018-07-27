package entity;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
@NamedQuery(name = "String.findNotSpeakAnimal", query = "SELECT p.name FROM Papagal p WHERE p.speak=?3")
@Entity

public class Papagal extends Animal {

    private Type type;
    private boolean speak;

    public boolean isSpeak() {
        return speak;
    }

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }

    public void setType(){
       this.type=Type.BIRD;
    }
}
