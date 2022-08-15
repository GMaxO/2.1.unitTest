import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookTest {
    static StringBuilder note = new StringBuilder();
    Book sut;


    @BeforeAll
    public static void started() {
        System.out.println(note.append(" Тест начался "));
    }

    @Test
    public void testNotNull() {
        Book book = new Book(new Autor("Жюль Верн", 1828), "Capitan Nemo", 221, 1.1f);
        int expected = book.getPages();
        assertNotNull(expected);
        System.out.println(note.append(" Тест прошел успешно "));
    }
    @Test
    public void testBook() {
        Book book = new Book(new Autor("Жюль Верн", 1828), "Capitan Nemo", 221, 1.1f);
        float expected = 1.1f;
        float actual = book.getWeight();
        Assertions.assertEquals(expected, actual);
        System.out.println(note.append(" Тест прошел успешно "));
    }


    @AfterAll
    public static void writeResultTest() {
        System.out.println(note.append(" Тест завершен "));
        try (FileWriter writer = new FileWriter("resultTest.txt", true)) {
            writer.write(String.valueOf(note));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}