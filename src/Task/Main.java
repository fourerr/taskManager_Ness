package Task;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    static List<Task> tasks=new ArrayList<>();// static list of tasks

    /**
     * main function
     * @throws ParseException -can be error if parsing the execution date is failed
     */
    public static void main() throws ParseException {
        /*
          adding two tasks to list tasks
         */
        tasks.add(new Task("1","05/09/2022", Status.In_progress));
        tasks.add(new Task("2","12/12/2022", Status.Suspended));


        /*
          print the sie of the list before delete
         */
        System.out.println("size of the list is "+tasks.size());


        tasks.remove(getTaskByDescription("1"));// remove  element with description "1"


        System.out.println("after delete one element in task list ,size of the list is "+tasks.size() +'\n');// print size of list after delete


        /*
            edit task with description 2 and change its status to Complete
         */
        Task t=getTaskByDescription("2");
        t.set_Status_task(Status.Completed);

        /*
            iterate over the tasks list and print information about the task in list using toString function
         */
        for (Task task : tasks) {
            System.out.println(task.toString());
        }

    }

    /**
     * get task object by its description using stream
     * @param description the description of task -String
     * @return task with the same description
     */
    public static Task getTaskByDescription(String description){

       return(tasks.stream().filter(task->task.getDescription().equals(description)).findFirst().orElse(null));
    }
}
