import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        sc.close();

        if(l1 >= l2 +l3 || l2 >= l1+l3 || l3 >= l1+l2){
            System.out.println("Invalido");
            return;
        }


        if(l1 == l2 && l1 ==l3){
            System.out.println("Valido-Equilatero");
        }else if(l1 != l2 && l1 != l3 && l2 != l3){
            System.out.println("Valido-Escaleno");  
        }else{
            System.out.println("Valido-Isoceles");
        }

        if(l1 * l1 + l2 * l2 - l3*l3 == 0){
            System.out.println("Retangulo: S");
        }else if(l2 * l2 + l3 * l3 - l1* l1 == 0){
            System.out.println("Retangulo: S");
        }else if(l1 * l1 + l3 * l3 - l2 * l2 == 0){
            System.out.println("Retangulo: S");
        }else{
            System.out.println("Retangulo: N");
        }

    }
}
