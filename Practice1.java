//TÍNH BMI VÀ HIỆN TÌNH TRẠNG CƠ THỂ
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Your weight (in kilogram):");
        weight=scanner.nextDouble();
        
        System.out.print("Your height (in meter):");
        height=scanner.nextDouble();
         bmi=weight/Math.pow(height, 2);
     
      if(bmi<18){
        System.out.println("Bmi: "+bmi+" Underweight");
      }else if(bmi<25.0){
        System.out.println("Bmi: "+bmi+ " Normal");
      }else if(bmi<30.0){
        System.out.println("Bmi: "+bmi+" Overweight");
      }else{
        System.out.println("bmi: "+bmi+" Obese");
      }
    }
}