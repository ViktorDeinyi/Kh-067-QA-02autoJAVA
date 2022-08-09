package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class GroupParams {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;
    Scanner sc = new Scanner(System.in);

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public String[] getStudentArray() {
        return studentArray;
    }

    public GroupParams(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        endYear = startYear + 5;
    }

    public GroupParams(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        endYear = startYear + 5;
    }

    public String[] AddStudents() {
        if (studentArray == null) {
            System.out.print("Для группы " + getGroupName());
            System.out.println(" не указаны студенты. Введите их формате: name1, name2, ... nameX ");
            String addstudents = sc.nextLine();
            String[] students = addstudents.split(", ");
            this.studentArray = students;
        } return studentArray;
    }

    public void getGroupDescription() {
        System.out.println("Название группы: " + getGroupName());
        System.out.println("Год поступления: " + getStartYear());
        System.out.println("Год выпуска: " + getEndYear());
        System.out.println("Список студентов: " + Arrays.toString(getStudentArray()));
    }


}

