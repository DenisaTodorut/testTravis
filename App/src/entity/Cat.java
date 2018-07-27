package entity;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal{

   private Type type;
    private boolean played;

    public void setType(){
        this.type= Type.MAMMALS;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }
}
