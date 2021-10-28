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


        builder.buildAWall(brickList, 6, 3, Character.BEARING);
        builder.buildAWall(brickList, 7, 1, Character.PARTITION);
        builder.buildAWall(brickList, 5, 2, Character.EXTERNAL);

        System.out.println(builder.getInspectionBody().get(Type.CHECKS_THERMAL_CONDUCTIVITY));
        System.out.println(builder.getInspectionBody().get(Type.CHECKS_SOUND_INSULATION));
        System.out.println(builder.getInspectionBody().get(Type.COUNTER_SIZE));


    }
}
