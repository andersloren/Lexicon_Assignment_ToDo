package lexicon;

public class TodoItemTask {
    // ******
    // Fields
    // ******


    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    // **************
    // Constructor(s)
    // **************


    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;
    }

    // *******
    // Methods
    // *******
    public String getSummary() {
        return "id: " + getId() +
                ", title: " + isAssigned()+
                ", todo item: " + getTodoItem().getSummary();
    }

    // *****************
    // Getters & Setters
    // *****************


    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }


    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
