package provider;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import entity.Person;
import java.util.Scanner;

public class ProviderPerson {
    public Person createPerson(){
        
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        
        System.out.println("ИМЯ:");
        String firstname = scanner.nextLine();
        person.setFirstname(firstname);
        
        System.out.println("ФАМИЛИЯ:");
        String lastname = scanner.nextLine();
        person.setLastname(lastname);
        
        System.out.println("ДОЛЖНОСТЬ:");
        String status = scanner.nextLine();
        person.setStatus(status);
        
        return person;
    }
    
}