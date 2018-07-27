package run;

import entity.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        EntityManagerFactory factory =Persistence.createEntityManagerFactory("jpa_example");
        EntityManager em= factory.createEntityManager();
        EntityTransaction transaction=em.getTransaction();

        transaction.begin();

        Cat cat1=new Cat();
        cat1.setName("Cat1");
        cat1.setColour("brown");
        cat1.setPlayed(true);
        cat1.setType();
        em.persist(cat1);

        Dog dog1=new Dog();
        dog1.setType();
        dog1.setPlayed(true);
        dog1.setName("Puffy");
        em.persist(dog1);

        Papagal papagal1=new Papagal();
        papagal1.setName("P1");
        papagal1.setType();
        papagal1.setSpeak(false);
        em.persist(papagal1);

        Human human1=new Human();
        List<Animal> animalList=new ArrayList<>();
        animalList.add(cat1);
        human1.setName("Mihai");
        human1.setAge(40);
        human1.setAnimalList(animalList);
        em.persist(human1);

        Human human2=new Human();
        List<Animal> animalList1=new ArrayList<>();
        animalList.add(dog1);
        animalList.add(papagal1);
        human1.setName("Mihai1");
        human1.setAge(30);
        human1.setAnimalList(animalList1);
        em.persist(human2);

//        Query namedQuery = em.createNamedQuery("Human.findOfName");
////        namedQuery.setParameter(1,"Mihai");
//        List<Human> lSel1 = namedQuery.getResultList();
//        for(Human p : lSel1)
//        {
//
//            System.out.println(p.getName()+" has age "+p.getAge());
//
//        }

        Query namedQuery1 = em.createNamedQuery("Dog.findPlayed");
        namedQuery1.setParameter(1,true);
        List<Dog> lSel2 = namedQuery1.getResultList();
        System.out.println("The dogs played are:");
        for(Dog p : lSel2)
        {
            System.out.println(p.getName());

        }

//        Query namedQuery3 = em.createNamedQuery("Human.findOfAnimal");
//       namedQuery3.setParameter("age1",20);
//        List<Animal> lSel3 = namedQuery3.getResultList();
//

//            for(Animal p : lSel3)
//            {
//
//                System.out.println(p.getName());
//
//            }
//        }else{
//            System.out.println("the human doesn't has animals");
//        }

        Query namedQuery4 = em.createNamedQuery("String.findNotSpeakAnimal");
        namedQuery4.setParameter(3,false);
        List<String> lSel4 = namedQuery4.getResultList();
        System.out.println("The papagals which can't speak are:");
        for(String p : lSel4)
            {

                System.out.println(p+" ");

            }

        transaction.commit();
        factory.close();
    }

}
