package lexicon;

import lexicon.model.Person;
import lexicon.model.TodoItem;
import lexicon.model.TodoItemTask;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {

        // Part 1
        Person person = new Person(12, "Anders", "Loren", "anders.loren@gmail.com");
        TodoItem todoItem = new TodoItem(4, "Buy groceries", "Check refrigerator, write a shopping list, and then go do the shopping!", LocalDate.of(2023, 8, 20), false, person);
        TodoItemTask todoItemTask = new TodoItemTask(2, true, todoItem, person);

        System.out.println(person.toString());
        System.out.println(todoItem.toString());
        System.out.println(todoItemTask.toString());

        // Part 2
        System.out.println(person.toString());
    }
}
