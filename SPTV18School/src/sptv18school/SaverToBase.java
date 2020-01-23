
package sptv18school;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import entity.Person;
import entity.Journal;
import entity.Subject;
import interfaces.Saveable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaverToBase implements Saveable {
    
    private EntityManager em;
    private EntityTransaction tx;

    public SaverToBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SPTV18SchoolPU");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }

    @Override
    public void savePersons(List<Person> persons) {
        for (Person person: persons) {
            if (person.getId() == null) {
               tx.begin();
                  em.persist(person);
               tx.commit(); 
            } 
        }
    }

    @Override
    public List<Person> loadPersons() {
        List<Person> persons = em.createQuery("SELECT person FROM Person person").getResultList();
        return persons;
    }

    @Override
    public void saveSubjects(List<Subject> subjects) {
        for (Subject subject: subjects) {
            if (subject.getId() == null) {
               tx.begin();
                  em.persist(subject);
               tx.commit(); 
            } 
        }
    }

    @Override
    public List<Subject> loadSubjects() {
        List<Subject> subjects = em.createQuery("SELECT subject FROM Subject subject").getResultList();
        return subjects;
    }

    @Override
    public void saveJournals(List<Journal> journals) {
        for (Journal journal: journals) {
            if (journal.getId() == null) {
               tx.begin();
                  em.persist(journal);
               tx.commit(); 
            } 
        }
    }

    @Override
    public List<Journal> loadJournals() {
        List<Journal> journals = em.createQuery("SELECT journal FROM Journal journal").getResultList();
        return journals;
    }
    

}
