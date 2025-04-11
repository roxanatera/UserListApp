## Readme - Users List App
**List Users Preview**

📌**Descripción**
Aplicación de consola en Java para gestionar una lista de usuarios (agregar, listar y salir).
Tecnologías usadas:

**Aplicación de línea de comandos desarrollada en Java que permite:**

✅ Añadir nuevos usuarios (nombre, teléfono, email)

✅ Listar usuarios registrados en formato claro

✅ Salir del programa

## 💻 Tecnologías


Java 17+

POO (Programación Orientada a Objetos)

Encapsulamiento (private, getters/setters)

Colecciones (ArrayList)


 ## Características
✔ Encapsulamiento: Uso de private y métodos accesores (getters/setters).
✔ Modularidad: Código organizado en métodos reutilizables.
✔ Manejo de errores: Validación de entradas con try-catch.

public class User {
    private int id;
    private String name;
    private String tel;
    private String email;

    // Constructor, getters y setters
    @Override
    public String toString() {
        return String.format(
            """
            ID: %d
            Nombre: %s
            Teléfono: %s
            Email: %s
            """, 
            id, name, tel, email
        );
    }
}

public class ListaContactoAppApp {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        boolean salir = false;
        // Menú interactivo (switch-case)
    }
}

*** Users List App ***
1. Add
2. List
3. Exit
Proporciona la opción?: 2

LISTA DE USUARIOS:
------------------
ID: 1
Nombre: Julia
Teléfono: 63125456
Email: correo@correo.com