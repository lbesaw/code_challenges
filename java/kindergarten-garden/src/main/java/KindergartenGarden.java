import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KindergartenGarden {

    String[] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};;
    String plants;

    public KindergartenGarden(String plants) {
        this.plants = plants;
    }

    public KindergartenGarden(String plants, String[] students) {
        this.plants = plants;
        this.students = students;
       Arrays.sort(students);
    }

    public List<Plant> getPlantsOfStudent(String student) {
        ArrayList<Plant> result = new ArrayList<>();
        String[] plantArr = plants.split("\n");

        for(int i = 0;i < students.length;i++)
        {
            if(students[i].equals(student)) {
                result.add(Plant.getPlant(plantArr[0].charAt(i*2)));
                result.add(Plant.getPlant(plantArr[0].charAt(i*2+1)));
                result.add(Plant.getPlant(plantArr[1].charAt(i*2)));
                result.add(Plant.getPlant(plantArr[1].charAt(i*2+1)));
            }
        }

        return result;
    }
}
