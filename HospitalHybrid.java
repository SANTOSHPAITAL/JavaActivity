//HYBRID inheritance
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

class Intern extends Surgeon/*Dentist*/ {
 void Intern_Details() {
  System.out.println("Intern Detail...");
 }
}



public class HospitalHybrid {
    public static void main(String args[]) {
        Intern s = new Intern();
        s.Intern_Details();
        // s.Dentist_Details();
         s.Doctor_Details();
         s.Surgeon_Details();//Logger.error
        }
}
