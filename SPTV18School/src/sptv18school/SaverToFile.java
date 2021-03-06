package sptv18school;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import entity.Person;
import entity.Journal;
import entity.Subject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaverToFile {
    public void savePersons(List<Person>persons){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Persons.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(persons);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Файла Persons.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма записи в Persons.txt", ex);
        }
       
    }
    public List<Person> loadPersons(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Persons.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Person>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Нет файла Persons.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма чтения Persons.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Неизвестный класс Persons", ex);
        }
        return new ArrayList<Person>();
    }
    public void saveSubjects(List<Subject>subjects){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Subjects.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(subjects);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Файла Subjects.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма записи в Subjects.txt", ex);
        }
       
    }
    public List<Subject> loadSubjects(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Subjects.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Subject>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Нет файла Subjects.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма чтения Subjects.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Неизвестный класс Subjects", ex);
        }
        return new ArrayList<Subject>();
    }
    public void saveJournals(List<Journal>journals){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Journals.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(journals);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Файла Journals.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма записи в Journals.txt", ex);
        }
       
    }
    public List<Journal> loadJournals(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Journals.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Journal>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Нет файла Journals.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма чтения Journals.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Неизвестный класс Journals", ex);
        }
        return new ArrayList<Journal>();
    }
}