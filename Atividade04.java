import java.util.Scanner;

class At1 {
    public static void main(String[] args) {
    
    double nota1 = 0.0;
    double nota2 = 0.0;
    double nota3 = 0.0;
    double nota4 = 0.0;
       
    double total = 0.0;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a primeiro nota: ");
    nota1 = scanner.nextInt();
    
    System.out.println("Informe a segundo nota: ");
    nota2 = scanner.nextInt();
    
     System.out.println("Informe a segundo nota: ");
    nota3 = scanner.nextInt();
    
     System.out.println("Informe a segundo nota: ");
    nota4 = scanner.nextInt();
    
    
    total = (nota1 + nota2 + nota3 + nota4) /4; 
    
    System.out.println("O valor do calculo e: " + total );
    
    }
}
