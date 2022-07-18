//Hierarchial inheritance
import java.io.*;
class Doctor {
 void Doctor_Details() {
  System.out.println("Doctor Details...");
 }
}

class Surgeon extends Doctor {
 void Surgeon_Details() {
  System.out.println("Surgeon Detail...");
 }
}

class Dentist extends Doctor {
 void Dentist_Details() {
  System.out.println("Dentist Detail...");
 }
}


public class HospitalHierarchial {
    public static void main(String args[]) {
        Dentist s = new Dentist();
         s.Dentist_Details();
         s.Doctor_Details();
         //s.Surgeon_Details();//error
        }
}
