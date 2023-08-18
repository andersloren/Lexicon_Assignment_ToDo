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
    public void toDoItemThrowsIfTitleIsNull() {
        Person person = new Person(1, "Anders", "Loren", "anders.loren@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, null, "description", LocalDate.now(), true, person));
    }
    @Test
    @DisplayName("The title of the TodoItem object should not be empty")
    public void toDoItemThrowsIfTitleIsEmpty() {
        Person person = new Person(1, "Anders", "Loren", "anders.loren@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, "", "description", LocalDate.now(), true, person));
    }

    @Test
    @DisplayName("The deadline of the TodoItem object should not be null")
    public void ToDoItemThrowsIfDeadlineIsNull() {
        Person person = new Person(1, "Anders", "Loren", "anders.loren@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, "title", "description", null, true, person));
    }

    @Test
    @DisplayName("When toString() is invoked on a TodoItem object it should be equal to the string provided in test")
    public void todoItemReturnsInformationWhenToStringIsInvoked() {
        Person anders = new Person(12, "anders", "loren", "anders.loren@gmail.com");
        TodoItem todoItem = new TodoItem(4, "Buy groceries", "Check refrigerator, write a shopping list, and then go do the shopping!", LocalDate.of(2023, 8, 20), false, anders);
        assertEquals("TodoItem { id: 4, title: Buy groceries, task description: Check refrigerator, write a shopping list, and then go do the shopping!, deadline: 2023-08-20, is overdue? false, done: false }", todoItem.toString());
    }
}