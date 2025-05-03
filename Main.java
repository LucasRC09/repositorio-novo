import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 MenuLogin login = new MenuLogin();
 boolean autenticado = false;
 while (!autenticado) {
 System.out.print("Usuário: ");
 String usuario = sc.nextLine();
 System.out.print("Senha: ");
 String senha = sc.nextLine();
 if (login.autenticar(usuario, senha)) {
 System.out.println("Login bem-sucedido!");
 autenticado = true;
 } else {
 System.out.println("Usuário ou senha incorretos. Tente novamente.\n");
 }
 }
 sc.close();
 }
}