package Task;

import java.util.Date;

public class Task {
   private String description;
    private String execution_date;
    private Status status_task;
    public Task(){
        this.status_task=Status.New;
    }
    public Task(String description,String execution_date,Status status_task){
        this.description=description;
        this.execution_date=execution_date;
        this.status_task=status_task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExecution_date() {
        return execution_date;
    }

    public void setExecution_date(String execution_date) {
        this.execution_date = execution_date;
    }

    public Status get_Status_task() {
        return status_task;
    }

    public void set_Status_task(Status status_task) {
        this.status_task = status_task;
    }
}

