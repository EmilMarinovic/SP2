abstract class NetTitle extends Title{
    protected int availability; //Ændret til protected for at få adgang i EBook & EAudioBook
    protected int reach; //Ændret til protected for at få adgang i EBook & EAudioBook
    protected int use; //Ændret til protected for at få adgang i EBook & EAudioBook

    public NetTitle(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    protected double getPseudoCopies() {
        return 0;
    }

    private int getUseFactor() {
        return 0;
    }
}
