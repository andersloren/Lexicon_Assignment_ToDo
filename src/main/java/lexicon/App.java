package lexicon;

import lexicon.model.Person;
import lexicon.model.TodoItem;
import lexicon.model.TodoItemTask;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {

        // Part 1
        Person anders = new Person(12, "Anders", "Loren", "ander.loren@gmail.com");
        TodoItem buyGroceries = new TodoItem(4, "Buy groceries", "Check refrigerator, write a shopping list, and then go do the shopping!", LocalDate.of(2023, 8, 20), false, anders);
        TodoItemTask task = new TodoItemTask(2, true, buyGroceries, anders);

        System.out.println(anders.getSummary());
        System.out.println(buyGroceries.getSummary());
        System.out.println(task.getSummary());

        // Part 2
        AppUser appUser1 = new AppUser("anders", "password", AppRole.ROLE_APP_ADMIN);
        AppUser appUser2 = new AppUser("anders", "password", AppRole.ROLE_APP_ADMIN);


        System.out.println(appUser1.equals(appUser2));
        System.out.println(appUser1.hashCode() == appUser2.hashCode());
        System.out.println(appUser1.toString());
        System.out.println(appUser2.toString());
    }
}
