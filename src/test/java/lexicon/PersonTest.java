package lexicon;

import lexicon.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @DisplayName("WHEN Person object is instantiated, IF firstname OR lastname OR email is null, THEN throw")
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
    @DisplayName("WHEN Person object method getSummary() is called, THEN return correct string")
    @CsvSource({
            "1, anders, loren, anders.loren@gmail.com",
            "2, erik, svensson, erik.svensson@gmail.com"
    })
    public void personGetSummaryShouldReturnCorrectString(int id, String firstName, String lastName, String email) {
        Person person = new Person(id, firstName, lastName, email);
        assertEquals(person.getSummary(), "id: " + id +
                ", name: " + firstName + " " + lastName +
                ", email: " + email);
    }
}