public class fibonacci {
    public static void main(String[] args) {
        int n = 0;
        int cont = 0;

        while (n < 10) {
            n = n + 1;
            cont = cont + n; 
        }

        System.out.println(cont);  
    }
}
