import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class AutorTest {
    static StringBuilder note = new StringBuilder();
    Autor sut;


    @BeforeAll
    public static void started() {
        System.out.println(" Тест начался ");
        note.append(" Тест начался ");
    }

    @Test
    public void testYearOfBird() {
        Autor autor2 = new Autor("Жюль Верн",1828);
        int expected = 1828;
        int actual = autor2.getYearOfBird();
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