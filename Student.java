import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private String branch;
    private Date dob;

    public Student(String name, String branch, String dobStr) throws ParseException {
        this.name = name;
        this.branch = branch;
        this.dob = parseDate(dobStr);
    }

    private Date parseDate(String dobStr) throws ParseException {
        String[] formats = {"dd-MM-yyyy", "yyyy-MM-dd"};
        for (String format : formats) {
            try {
                return new SimpleDateFormat(format, Locale.ENGLISH).parse(dobStr);
            } catch (ParseException ignored) {
                // Try next format
            }
        }
        throw new ParseException("Invalid date format. Supported formats: dd-MM-yyyy or yyyy-MM-dd", 0);
    }

    public void displayInfo() {
        Calendar dobCalendar = Calendar.getInstance();
        dobCalendar.setTime(dob);

        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < dobCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Name   : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("DOB    : " + new SimpleDateFormat("dd-MM-yyyy").format(dob));
        System.out.println("Age    : " + age + " years");
    }

    public static void main(String[] args) {
        try {
            Student s = new Student("John Doe", "Computer Science", "15-04-2000");
            s.displayInfo();
        } catch (ParseException e) {
            System.out.println("Date parsing error: " + e.getMessage());
        }
    }
}
