package lexicon;

import lexicon.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @DisplayName("The firstname, lastname, and email, should not be equal to null")
    @CsvSource(value ={
            "1, null, loren, anders.loren@gmail.com",
            "1, anders, null, anders.loren@gmail.com",
            "1, anders, loren, null"
    }, nullValues = {"null"})
    public void personThrowsIfFirstnameOrLastnameOrEmailIsNull(int id, String firstName, String lastName, String email) {

        assertThrows(IllegalArgumentException.class,
                () -> new Person(id, firstName, lastName, email));
    }

    @ParameterizedTest
    @DisplayName("When getSummary() is invoked on a Person object it should be equal to the string provided in test")
    @CsvSource({
            "1, anders, loren, anders.loren@gmail.com",
    })
    public void personGetSummaryShouldReturnCorrectString(int id, String firstName, String lastName, String email) {
        Person person = new Person(id, firstName, lastName, email);
        assertEquals("id: 1, name: anders loren, email: anders.loren@gmail.com", person.getSummary());
    }
}