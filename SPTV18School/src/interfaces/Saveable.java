package interfaces;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import entity.Person;
import entity.Journal;
import entity.Subject;
import java.util.List;

public interface Saveable {
    public void saveJournals(List<Journal>journal);
    public List<Journal> loadJournals();
    
    public void savePersons(List<Person>persons);
    public List<Person> loadPersons();
    
    public void saveSubjects(List<Subject>subjects);
    public List<Subject> loadSubjects();
    
    
}
