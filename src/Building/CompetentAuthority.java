package Building;

interface CompetentAuthority {
    void acceptNotification(Wall wall);

    boolean wallMatching();

    Wall getWall();
    Type getType();
}
