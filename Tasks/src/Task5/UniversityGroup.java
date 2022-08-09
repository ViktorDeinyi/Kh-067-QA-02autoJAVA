package Task5;

import java.util.Arrays;

public class UniversityGroup {

    public static void main(String[] args) {
        GroupParams firstGroup = new GroupParams("freshman", 2020, new String[]{"roy", "mark", "tom"});
        firstGroup.AddStudents();
        GroupParams secondGroup = new GroupParams("oldman", 2018);
        secondGroup.AddStudents();
        firstGroup.getGroupDescription();
        secondGroup.getGroupDescription();

    }
}
