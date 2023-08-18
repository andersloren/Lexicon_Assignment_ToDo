package lexicon;

import lexicon.model.Person;
import lexicon.model.TodoItem;
import lexicon.model.TodoItemTask;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoItemTaskTest {

    @Test
    @DisplayName("When toString() is invoked on a TodoItemTask object it should be equal to the string provided in test")
    public void todoItemTaskReturnsInformationWhenToStringIsInvoked() {
        Person person = new Person(12, "anders", "loren", "anders.loren@gmail.com");
        TodoItem todoItem = new TodoItem(4, "Buy groceries", "Check refrigerator, write a shopping list, and then go do the shopping!", LocalDate.of(2023, 8, 20), false, person);
        TodoItemTask task = new TodoItemTask(2, true, todoItem, person);
        assertEquals("TodoItemTask { id: 2, todo item: TodoItem { id: 4, title: Buy groceries, task description: Check refrigerator, write a shopping list, and then go do the shopping!, deadline: 2023-08-20, is overdue? false, done: false } }", task.toString());
    }
}