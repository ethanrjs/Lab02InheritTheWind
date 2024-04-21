public class Person {
    private String firstName;
    private String lastName;
    private final String ID;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFormalName() {
        return title + " " + getFullName();
    }

    public int getAge() {
        return java.time.LocalDate.now().getYear() - YOB;
    }

    public int getAge(int year) {
        return year - YOB;
    }
}
