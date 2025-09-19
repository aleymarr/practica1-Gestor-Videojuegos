import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola este mi proyecto de persistencia de datos de videojuegos en ficheros.");
        System.out.println("Por favor, ingrese el nombre del videojuego:");
        String nombre = sc.nextLine();
        
        
        sc.close(); 
    }
}