package lexicon;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {
        Person anders = new Person(1, "Anders", "Loren", "ander.loren@gmail.com");
        TodoItem buyGroceries = new TodoItem(1, "Buy groceries", "Check refrigerator, write a shopping list, and then go do the shopping!", LocalDate.of(2023, 8, 20), false, anders);
        TodoItemTask task = new TodoItemTask(1, true, buyGroceries, anders);

        System.out.println(anders.getSummary());
        System.out.println(buyGroceries.getSummary());
        System.out.println(task.getSummary());

    }
}
