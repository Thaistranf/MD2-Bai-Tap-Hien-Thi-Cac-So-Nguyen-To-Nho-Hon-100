
public class Main {
    public static void main(String[] args) {
        System.out.println("Danh sách các SNT nhỏ hơn 100:");
        for (int i = 2; i < 100; i++) {
            if (checkSNT(i)){
                System.out.print(i + " ");
            }
        }
    }
    private static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}