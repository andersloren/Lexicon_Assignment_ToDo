package lexicon;

import lexicon.model.Person;
import lexicon.model.TodoItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    @DisplayName("The title of the TodoItemTest object should not be equal to null")
    public void todoitemThrowsIfTitleIsNull() {
        Person person = new Person(1, "Anders", "Loren", "anders.loren@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, null, "description", LocalDate.now(), true, person));
    }
    @Test
    @DisplayName("The title of the TodoItem object should not be empty")
    public void todoitemThrowsIfTitleIsEmpty() {
        Person person = new Person(1, "Anders", "Loren", "anders.loren@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, "", "description", LocalDate.now(), true, person));
    }

    @Test
    @DisplayName("The deadline of the TodoItem object should not be null")
    public void todoitemThrowsIfDeadlineIsNull() {
        Person person = new Person(1, "Anders", "Loren", "anders.loren@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, "title", "description", null, true, person));
    }
}