package Building;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall("Несущая", 20, 10, 100);
        String text = "стена готова";
        WallReadyNotifier wallReadyNotifier = new WallReadyNotifier();

        InspectionBodies inspectionBodies1 = new InspectionBodies("Дмитрий", Type.CHECKS_SOUND_INSULATION);
        InspectionBodies inspectionBodies2 = new InspectionBodies("Иван", Type.COUNTER_SIZE);
        InspectionBodies inspectionBodies3 = new InspectionBodies("Александр", Type.CHECKS_THERMAL_CONDUCTIVITY);

        List<InspectionBodies> list = new ArrayList<>();
        list.add(inspectionBodies1);
        list.add(inspectionBodies2);
        list.add(inspectionBodies3);

        wallReadyNotifier.setInspectionBody(list);
        wallReadyNotifier.notifyTheCompetentAuthority(text,wall);

        System.out.println(inspectionBodies1.getName()+" получил уведомление "+inspectionBodies1.getNotification().getText()+wall);
    }
}
