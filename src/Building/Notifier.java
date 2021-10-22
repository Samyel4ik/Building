package Building;

public interface Notifier{ //уведомитель
    void notifyTheCompetentAuthority(String text,Wall wall);
    void addInspectionBodies(InspectionBodies inspectionBodies);

}
