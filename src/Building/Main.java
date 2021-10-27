package Building;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();

        List<Wall> wallList = new ArrayList<>();
        builder.setWallList(wallList);

        List<CompetentAuthority> competentAuthorityList = new ArrayList<>();
        competentAuthorityList.add(new InspectorChecksTheSound("Dima"));
        competentAuthorityList.add(new InspectorChecksWarmth("Tom"));
        competentAuthorityList.add(new InspectionCheckSize("Tim"));

        builder.setInspectionBody(competentAuthorityList);


        List<Brick> brickList = new ArrayList<>();
        brickList.add(new Brick(10, 100));
        brickList.add(new Brick(10, 100));
        brickList.add(new Brick(10, 100));

        builder.buildAWall(brickList, 6, 3,Character.BEARING);

        System.out.println(competentAuthorityList.get(0).getWall());
        System.out.println(competentAuthorityList.get(1).getWall());
        System.out.println(competentAuthorityList.get(2).getWall());
    }
}
