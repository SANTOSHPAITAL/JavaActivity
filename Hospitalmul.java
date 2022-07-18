//multilevel  inheritance
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

class Junior_Surgeon extends Surgeon {
 void Junior_Surgeon_Details() {
  System.out.println("Junior Surgeon Detail...");
 }
}
public class Hospitalmul {
    public static void main(String args[]) {
        Junior_Surgeon s = new Junior_Surgeon();
        s.Junior_Surgeon_Details();
        s.Doctor_Details();
        s.Surgeon_Details();
       }
}
