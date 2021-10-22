package Building;

import java.util.List;

public class WallReadyNotifier implements Notifier{
    List<CompetentAuthority> inspectionBody;

    public void setInspectionBody(List<CompetentAuthority> inspectionBody) {
        this.inspectionBody = inspectionBody;
    }


    public void addInspectionBodies(CompetentAuthority inspectionBodies) {
        this.inspectionBody.add(inspectionBodies);
    }

    @Override
    public void notifyTheCompetentAuthority(Wall wall) {
        Notification notification = new Notification(wall);
        for (int i = 0; i < this.inspectionBody.size(); i++) {
            this.inspectionBody.get(i).acceptNotification(notification);
        }
    }
}
