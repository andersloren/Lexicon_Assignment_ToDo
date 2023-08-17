package lexicon.model;

import lexicon.model.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
        setTitle(title);
        this.taskDescription = taskDescription;
        setDeadLine(deadLine);
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

    // ******************************************
    // Overridden methods from 'java.lang.Object'
    // ******************************************

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
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
        if (title == null || title.isEmpty()) throw new IllegalArgumentException("Title name cannot be null");
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
        if (deadLine == null) throw new IllegalArgumentException("Deadline name cannot be null");
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
