package sptv18school;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import entity.Journal;
import entity.Person;
import entity.Subject;
import interfaces.Saveable;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;
import provider.ProviderJournal;
import provider.ProviderPerson;
import provider.ProviderSubject;

public class App {
    List<Journal> journals = new ArrayList<>();
    List<Person> persons = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    Saveable saver;
    public App() {
        //saverToFile = new SaverToFile();
        saver = new SaverToBase(); 
        journals.addAll(saver.loadJournals());
        persons.addAll(saver.loadPersons());
        subjects.addAll(saver.loadSubjects());
    }
    
    public void run(){
        System.out.println("<<< Журнал группы SPTV18 >>>");
        boolean repeat = true;
        Tools tools = new Tools();
        do{
            System.out.println(" ");
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить нового Учетеля/ученика)");
            System.out.println("2. Добавить новый учебный предмет");
            System.out.println("3. Добавить новый журнал");
            System.out.println("4. Показать список учителей/учеников");
            System.out.println("5. Показать список учебных предметов");
            System.out.println("6. Показать список журналов");
            System.out.println("7. Изменить данные журнала");
            System.out.println("<-- Выбери номер задачи -->");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Программа закрывается");
                    repeat=false;
                    break;
                case 1:
                    ProviderPerson providerPerson = new ProviderPerson();
                    Person person=providerPerson.createPerson();
                    persons.add(person);
                    saver.savePersons(persons);
                    System.out.println("Учитель/ученик добавлены"+person.toString());
                    break;
                case 2:
                    ProviderSubject providerSubject = new ProviderSubject();
                    Subject subject = providerSubject.createSubject();
                    subjects.add(subject);
                    saver.saveSubjects(subjects);
                    System.out.println("Учебный предмет добавлен");
                    System.out.println(subject.toString());
                    break;
                case 3:
                    ProviderJournal providerJournal = new ProviderJournal();
                    Journal journal = providerJournal.createJournal(persons, subjects);
                    journals.add(journal);
                    saver.saveJournals(journals);
                    System.out.println("Новый журнал добавлен");
                    System.out.println(journal.toString());
                    break;
                case 4:
                     System.out.println("Список учителей/учеников");
                    for (int i = 0; i < persons.size(); i++) {
                        System.out.println(i+1+". "+persons.get(i).toString());
                    }
                    break;
                case 5:
                    System.out.println("Список учебных предметов");
                    for (int i = 0; i<subjects.size(); i++) {
                        System.out.println(i + 1 + ". " + subjects.get(i).toString());
                    }
                    break;
                case 6:
                    System.out.println("Список учебных предметов");
                    for (int i = 0; i<journals.size(); i++) {
                        System.out.println(i + 1 + ". " + journals.get(i).toString());
                    }
                    break;
                case 7:
                    tools.printListJournals(journals);
                    break;
                            
            }
        }while(repeat);
    }
}