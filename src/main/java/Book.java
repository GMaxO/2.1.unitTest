public class Book {
    public Autor autor;
    public String name;
    public int pages;
    public float weight;

    public int getPages() {
        return pages;
    }

    public float getWeight() {
        return weight;
    }

    public Book(Autor autor, String name, int pages, float weight){
        this.autor = autor;
        this.name = name;
        this.pages = pages;
        this.weight = weight;
    }

    public String toString() {
        return autor + "Название книги: " + name + ".\n" + "Количество страниц: " + pages + ".\n" + "Вес книги: " + weight;
    }
}