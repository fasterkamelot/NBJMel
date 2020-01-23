package sptv18school;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import entity.Journal;
import entity.Person;
import java.util.List;
import java.util.Scanner;

public class Tools {
    private Scanner scanner = new Scanner(System.in);

    void printListPersons(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.println(i + 1 + ". " + person.toString());
        }
        System.out.println("Для редактирования данных человека введите номер человека или 0:");
        int indexPerson = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexPerson){
            Person person = persons.get(indexPerson-1);
            person = editPerson(person);
            persons.set(indexPerson-1, person);
        }
    }
    
    void printListJournals(List<Journal> journals) {
        for (int i = 0; i < journals.size(); i++) {
            Journal journal = journals.get(i);
            System.out.println(i + 1 + ". " + journal.toString());
        }
        System.out.println("Для редактирования данных журнала введите номер человека или 0:");
        int indexJournal = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexJournal){
            Journal journal = journals.get(indexJournal-1);
            journal = editJournal(journal);
            journals.set(indexJournal-1, journal);
        }
    }

    private Person editPerson(Person person) {
        System.out.println("Введите правильное значение:");
        System.out.print("Должность: ");
        System.out.println(person.getStatus());
        System.out.print("Исправить на: ");
        String newStatus = scanner.nextLine();
        System.out.print("Фамилия: ");
        System.out.println(person.getLastname());
        System.out.print("Исправить на: ");
        String newLastname = scanner.nextLine();
        System.out.print("Имя: ");
        System.out.println(person.getFirstname());
        System.out.print("Исправить на: ");
        String newFirstname = scanner.nextLine();
        scanner.nextLine();
        if(!"0".equals(newStatus)){
           person.setStatus(newStatus); 
        }
        if(!"0".equals(newLastname)){
           person.setLastname(newLastname); 
        }
        if(!"0".equals(newFirstname)){
           person.setFirstname(newFirstname); 
        }
        return person;
    }
    
    private Journal editJournal(Journal journal) {
        
        System.out.print("Изменение оценки:");
        System.out.println(journal.getMark());
        System.out.print("Исправить на:");
        int newMark = scanner.nextInt();
        scanner.nextLine();
        if(!"0".equals(newMark)){
           journal.setMark(newMark); 
        }
        return journal;
    }
}