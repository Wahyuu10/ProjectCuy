import java.util.Scanner;


public class MenghitungBeratBadanIdeal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        double pounds;
        double iches;
        float bmi;
       
       pounds = 0.45359237;
       iches = 0.0254;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung berat badan ideal");
      
        System.out.println("masukan berat : ");
        pounds = input.nextDouble();
      
        System.out.println("masukan tinggi");
        double inches = input.nextDouble();
      
        bmi = (float) (pounds/inches*inches);
        
        System.out.println("tampilkan hasil : "+bmi);
        
        
                
    }
    
}
