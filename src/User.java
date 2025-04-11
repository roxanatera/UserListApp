public class User {
    private int id;
    private String name;
    private String tel;
    private String email;
    private static int numberusers = 0; // Variable estática añadida para el conteo

    public User() {
        this.id = ++numberusers; // Incrementa el contador y asigna el ID
    }

    // Constructor con argumentos
    public User(String name, String tel, String email) {
        this(); // Llama al constructor sin argumentos para asignar el ID
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    // Getters y setters (correctos)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("Julia Natera", "6321546", "correo@correo.com");
        System.out.println(user1);
    }
}