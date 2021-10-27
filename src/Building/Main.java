package Building;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();

        List<Wall> wallList = new ArrayList<>();
        builder.setWallList(wallList);
        Map<Type,CompetentAuthority>competentAuthorityList = new HashMap<>();

        competentAuthorityList.put(Type.CHECKS_SOUND_INSULATION,new InspectorChecksTheSound("Dima"));
        competentAuthorityList.put(Type.CHECKS_THERMAL_CONDUCTIVITY,new InspectorChecksWarmth("Tom"));
        competentAuthorityList.put(Type.COUNTER_SIZE,new InspectionCheckSize("Tim"));

        builder.setInspectionBody(competentAuthorityList);


        List<Brick> brickList = new ArrayList<>();
        brickList.add(new Brick(10, 100));
        brickList.add(new Brick(10, 100));
        brickList.add(new Brick(10, 100));

        builder.buildAWall(brickList, 6, 3,Character.BEARING);

       
    }
}
