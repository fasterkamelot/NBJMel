package provider;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import entity.Person;//BOOK
import entity.Journal;//HISTORY
import entity.Subject;//READER
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProviderJournal {
    public Journal createJournal(List<Person>persons,List<Subject>subjects){
        Scanner scanner = new Scanner(System.in);
        Journal journal = new Journal();
        System.out.println("Список Учителей/учеников");
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.println(i+1+". "+person.toString());
        }
        System.out.println("Выберите ученика");
        int numPersons = scanner.nextInt();
        journal.setPerson(persons.get(numPersons-1));
        System.out.println("Выберите учителя");
        journal.setPerson(persons.get(numPersons-1));
         System.out.println("Список предметов");
        for (int i = 0; i < subjects.size(); i++) {
            Subject reader = subjects.get(i);
            System.out.println(i+1+". "+reader.toString());
        }
        System.out.println("Выберите номер предмета");
        int numSubject = scanner.nextInt();
        journal.setSubject(subjects.get(numSubject-1));
        journal.setGiveOutJournal(new Date());
        System.out.println("Оценка");
        int mark = scanner.nextInt();
        journal.setMark(mark);
        return journal;
    }
}