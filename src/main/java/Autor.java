public class Autor {
    public String name;
    public static int yearOfBird;

    public Autor(String name, int yearOfBird) {
        this.name = name;
        this.yearOfBird = yearOfBird;
    }

    public int getYearOfBird() {
        return yearOfBird;
    }

    public String toString() {
        return "Автор: " + name + ".\n" + "Родился в " + yearOfBird + " году" + ".\n";
    }
}