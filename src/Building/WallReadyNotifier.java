package Building;

import java.util.List;

public class WallReadyNotifier implements Notifier{
    List<InspectionBodies> inspectionBody;

    public void setInspectionBody(List<InspectionBodies> inspectionBody) {
        this.inspectionBody = inspectionBody;
    }

    @Override
    public void addInspectionBodies(InspectionBodies inspectionBodies) {
        this.inspectionBody.add(inspectionBodies);
    }

    @Override
    public void notifyTheCompetentAuthority(String text,Wall wall) {
        Notification notification = new Notification(text,wall);
        for (int i = 0; i < this.inspectionBody.size(); i++) {
            this.inspectionBody.get(i).acceptNotification(notification);
        }
    }
}
