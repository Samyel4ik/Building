package Building;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Brick> brickList = new ArrayList<>();
        brickList.add(new Brick(10, 100));
        brickList.add(new Brick(12, 120));
        brickList.add(new Brick(15, 150));

        Builder builder = new Builder();

        builder.buildAWall(brickList, 6, 3);

        builder.addInspectionBodies(new InspectorChecksTheSound("Dima", Type.CHECKS_SOUND_INSULATION));
        builder.addInspectionBodies(new InspectorChecksWarmth("Tom", Type.CHECKS_THERMAL_CONDUCTIVITY));
        builder.addInspectionBodies(new InspectionCheckSize("Tim", Type.COUNTER_SIZE));

        builder.notifyTheCompetentAuthority("Стена готова");


    }
}
