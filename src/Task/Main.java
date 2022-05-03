package Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Task> tasks=new ArrayList<>();
        tasks.add(new Task("1","05.09.2022",Status.In_progress));
        System.out.println(tasks.get(0).getExecution_date());
        System.out.println(tasks.size());
        tasks.get(0).setExecution_date("06.09.2022");
        System.out.println(tasks.get(0).getExecution_date());
        tasks.remove(tasks.get(0));
        System.out.println(tasks.size());

    }
}
