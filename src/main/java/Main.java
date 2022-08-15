public class Main {
    public static void main(String[] args) {
        Autor autor2 = new Autor("Жюль Верн", 1828);
        Book book1 = new Book(autor2, "Capitan Nemo", 221, 1.1f);
        System.out.println(book1);
        System.out.println("------------------------------");

        Book book2 = new Book(autor2, "Black india", 222, 1.2f);
        System.out.println(book2);

        System.out.println("------------------------------");

        System.out.println(book1.autor.name);
        System.out.println(book1.autor.getYearOfBird());
        System.out.println(book1.getWeight());

    }
}