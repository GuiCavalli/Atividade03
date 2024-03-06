import java.util.Scanner;

class At1 {
    public static void main(String[] args) {
    
    int num1 = 0;
    int num2 = 0;
       
    int total =0;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o primeiro valor: ");
    num1 = scanner.nextInt();
    
    System.out.println("Informe o segundo valor: ");
    num2 = scanner.nextInt();
    
    
    total = num1 - num2;
    
    System.out.println("O valor do calculo e: " + total );
    
    }
}
