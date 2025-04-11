import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaContactoAppApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, users);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
                consola.nextLine();
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                *** Users List App ***
                1. Add
                2. List
                3. Exit
                """);
        System.out.print("Proporciona la opción?: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<User> users) {
        var opcion = Integer.parseInt(consola.nextLine());

        switch (opcion) {
            case 1 -> {
                System.out.print("Escribe el nombre: ");
                var name = consola.nextLine();
                System.out.print("Escribe el Telefono: ");
                var tel = consola.nextLine();
                System.out.print("Escribe el email: ");
                var email = consola.nextLine();

                var user = new User(name, tel, email);
                users.add(user);
                System.out.println("La lista tiene: " + users.size() + " Elementos");
                return false;
            }
            case 2 -> {
                System.out.println("╔════════════════ LISTA DE USUARIOS ════════════════╗");
                users.forEach(user -> {
                    System.out.println(
                            String.format(
                                    """
                                    ╠═══════════════════════════════
                                    ║ ID: %d
                                    ║ Nombre: %s
                                    ║ Teléfono: %s
                                    ║ Email: %s
                                    ╚═══════════════════════════════
                                    """,
                                    user.getId(), user.getName(), user.getTel(), user.getEmail()
                            )
                    );
                });
                return false;
            }
            case 3 -> {
                System.out.println("Saliendo del programa...");
                return true;
            }
            default -> {
                System.out.println("Opcion invalida. Intenta de nuevo.");
                return false;
            }
        }
    }
}