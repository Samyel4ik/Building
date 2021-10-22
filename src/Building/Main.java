package Building;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Brick> brickList = new ArrayList<>();

        Brick brick20 = new Brick(20, 20);
        Brick brick30 = new Brick(30, 30);
        Brick brick40 = new Brick(40, 40);

        brickList.add(brick20);
        brickList.add(brick30);
        brickList.add(brick40);

        Wall wall = new Wall(brickList, 90, 1);
        Builder builder = new Builder();
        List<Wall> list = new ArrayList<>();
        list.add(wall);
        builder.setWallList(list);

        List<CompetentAuthority> competentAuthorityList = new ArrayList<>();

        InspectionCheckSize inspectionCheckSize = new InspectionCheckSize("Дима", Type.COUNTER_SIZE);
        InspectorChecksTheSound inspectorChecksTheSound = new InspectorChecksTheSound("Вова", Type.CHECKS_SOUND_INSULATION);
        InspectorChecksWarmth inspectorChecksWarmth = new InspectorChecksWarmth("Рома", Type.CHECKS_THERMAL_CONDUCTIVITY);

        competentAuthorityList.add(inspectionCheckSize);
        competentAuthorityList.add(inspectorChecksWarmth);
        competentAuthorityList.add(inspectorChecksTheSound);

        WallReadyNotifier wallReadyNotifier = new WallReadyNotifier();
        wallReadyNotifier.setInspectionBody(competentAuthorityList);

        wallReadyNotifier.notifyTheCompetentAuthority(wall);

        System.out.println(inspectionCheckSize.wallMatching());
        System.out.println(inspectorChecksTheSound.wallMatching());
        System.out.println(inspectorChecksWarmth.wallMatching());

    }
}
