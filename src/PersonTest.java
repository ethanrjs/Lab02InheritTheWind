import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testFullName() {
        Person person = new Person("John", "Doe", "ID001", "Mr.", 1990);
        assertEquals("John Doe", person.getFullName());
    }

    @Test
    void testFormalName() {
        Person person = new Person("John", "Doe", "ID001", "Mr.", 1990);
        assertEquals("Mr. John Doe", person.getFormalName());
    }

    @Test
    void testGetAge() {
        Person person = new Person("John", "Doe", "ID001", "Mr.", 1990);
        assertEquals(java.time.LocalDate.now().getYear() - 1990, person.getAge());
    }

    @Test
    void testGetAgeSpecificYear() {
        Person person = new Person("John", "Doe", "ID001", "Mr.", 1990);
        assertEquals(30, person.getAge(2020));
    }
}
