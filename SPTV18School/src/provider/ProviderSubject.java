package provider;
/*
  BOOK = PERSON
  
  HISTORY = JOURNAL

  REDAER = SUBJECT
*/

import entity.Subject;
import java.util.Scanner;

public class ProviderSubject {
    public Subject createSubject(){
        Scanner scanner = new Scanner(System.in);
        Subject subject = new Subject();
        
        System.out.println("Предмет:");
        String subjects = scanner.nextLine();
        subject.setSubject(subjects);
        System.out.println("Часы");
        int hours = scanner.nextInt();
        subject.setHours(hours);
        
        return subject;
    }
}