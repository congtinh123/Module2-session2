

public class Exercise6 {
    public static void main(String[] args) {
        //tìm số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11.
        int n = 1;
        while(true){
            if(n % 5 == 0 && n % 7 == 0 && n % 11 == 0){
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11 là: " + n);
                break;
            }
            n++;
        }
    }
}
