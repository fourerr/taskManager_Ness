package Task;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * class represent task properties
 */
public class Task  {
    private String description;
    private String execution_date;
    private Status status_task;

    /**
     * Ctor with 3 parameters
     * @param description -description of the task-typical number task
     * @param execution_date - date that the task supposed to execute
     * @param status_task - the status of task including 4 options as describe in enum Status
     * @throws ParseException - func can throw an error if the parsing fail (in particular execution_date field)
     */
    public Task(String description,String execution_date,Status status_task) throws ParseException {
        this.description=description;
        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        Date date=df.parse(execution_date);
        this.execution_date=df.format(date);
        this.status_task=status_task;
    }


    /**
     * getter for description
     * @return string description
     */
    public String getDescription() {
        return description;
    }

    /**
     * edit new description for specific task
     * @param description string to change
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter for execution date
     * @return string of execution_date
     */
    public String getExecution_date() {
        return execution_date;
    }

    /**
     * edit execution date for specific task
     * @param execution_date string to change
     */
    public void setExecution_date(String execution_date) {
            this.execution_date = execution_date;
    }

    /**
     * getter for status task
     * @return Status enum - status task
     */
    public Status get_Status_task() {
        return status_task;
    }

    /**
     * edit status task for specific task
     * @param status_task Status enum to change
     */
    public void set_Status_task(Status status_task) {
        this.status_task = status_task;
    }

    /**
     * function to print the task properties on the screen clearly
     * @return string represent the task properties
     */
    public String toString(){
        return "description of task: "+this.description+"\n"
                +"execution date is: "+this.execution_date+"\n"
                +"status of the task is: "+this.status_task.toString()+"\n";
    }


}

