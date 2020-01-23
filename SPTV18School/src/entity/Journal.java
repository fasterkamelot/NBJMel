package entity;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Journal implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    @OneToOne
    private Person person;
    @OneToOne
    private Subject subject;
    
    private int mark;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date giveOutJournal;
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnJournal;
    
    public Journal() {
    }

    public Journal(Date giveOutJournal, Date returnJournal, int mark, Person person, Subject subject) {
        this.giveOutJournal = giveOutJournal;
        this.returnJournal = returnJournal;
        this.mark = mark;
        this.person = person;
        this.subject = subject;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGiveOutJournal() {
        return giveOutJournal;
    }

    public void setGiveOutJournal(Date giveOutJournal) {
        this.giveOutJournal = giveOutJournal;
    }

    public Date getReturnJournal() {
        return returnJournal;
    }

    public void setReturnJournal(Date returnJournal) {
        this.returnJournal = returnJournal;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Journal{" + "giveOutJournal=" + giveOutJournal + ", returnJournal=" + returnJournal + ", mark=" + mark + ", person=" + person + ", subject=" + subject + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.person);
        hash = 11 * hash + Objects.hashCode(this.subject);
        hash = 11 * hash + this.mark;
        hash = 11 * hash + Objects.hashCode(this.giveOutJournal);
        hash = 11 * hash + Objects.hashCode(this.returnJournal);
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
        final Journal other = (Journal) obj;
        if (this.mark != other.mark) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.giveOutJournal, other.giveOutJournal)) {
            return false;
        }
        if (!Objects.equals(this.returnJournal, other.returnJournal)) {
            return false;
        }
        return true;
    }
 

}
