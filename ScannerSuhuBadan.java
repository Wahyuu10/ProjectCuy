
import java.util.Scanner;


public class ScannerSuhuBadan{
  public static void main(String[] args){
    
    int nilai;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukan Suhu Badan : ");
    nilai = input.nextInt(System.in);
    
    if(nilai >= 38){
      System.out.println("RED LIGHT");
    }
    else{
      System.out.println(GREEN LIGHT);
    }
  }
}
