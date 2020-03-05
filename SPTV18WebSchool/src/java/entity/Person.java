package entity;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL
  REDAER = SUBJECT
*/

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Person implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String Status;
    private String Firstname;
    private String Lastname;

    public Person() {
    }

    public Person(String Status, String Firstname, String Lastname) {
        this.Status = Status;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    @Override
    public String toString() {
        return "Person{" + "Status=" + Status + ", Firstname=" + Firstname + ", Lastname=" + Lastname + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.Status);
        hash = 43 * hash + Objects.hashCode(this.Firstname);
        hash = 43 * hash + Objects.hashCode(this.Lastname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.Status, other.Status)) {
            return false;
        }
        if (!Objects.equals(this.Firstname, other.Firstname)) {
            return false;
        }
        if (!Objects.equals(this.Lastname, other.Lastname)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
   
    
}