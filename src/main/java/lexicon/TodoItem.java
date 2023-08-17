package lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Locale;

public class TodoItem {

    // ******
    // Fields
    // ******
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    // **************
    // Constructor(s)
    // **************


    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    // *******
    // Methods
    // *******
    public String getSummary() {
        return "id: " + getId() +
                ", title: " + getTitle() +
                ", task description: " + getTaskDescription() +
                ", deadline: " + getDeadLine() +
                ", is over due? " + isOverdue() +
                ", done: " + isDone() +
                ", creator: " + getCreator().getSummary();
    }

    public boolean isOverdue() {
        return deadLine.isBefore(LocalDateTime.now().toLocalDate());
    }

    // *****************
    // Getters & Setters
    // *****************

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}
