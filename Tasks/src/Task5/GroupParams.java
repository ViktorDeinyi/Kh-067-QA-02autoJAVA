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
            System.out.print("For a group " + getGroupName());
            System.out.println(" students are not specified. Enter them in the format: name1, name2, ... nameX ");
            String addStudents = sc.nextLine();
            this.studentArray = addStudents.split(", ");
        } return studentArray;
    }
    public void getGroupDescription() {
        System.out.println("Name of the group: " + getGroupName());
        System.out.println("Admission year: " + getStartYear());
        System.out.println("Graduation year: " + getEndYear());
        System.out.println("The list of the students: " + Arrays.toString(getStudentArray()));
    }
}

