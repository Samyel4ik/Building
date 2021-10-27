package Building;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();

        List<Brick> brickList = new ArrayList<>();
        brickList.add(new Brick(10, 100));
        brickList.add(new Brick(10, 100));
        brickList.add(new Brick(10, 100));
        
        builder.addInspectionBodies(new InspectorChecksTheSound("Dima"));
        builder.addInspectionBodies(new InspectorChecksWarmth("Tom"));
        builder.addInspectionBodies(new InspectionCheckSize("Tim"));

        builder.buildAWall(brickList, 6, 3,Character.BEARING);


    }
}
