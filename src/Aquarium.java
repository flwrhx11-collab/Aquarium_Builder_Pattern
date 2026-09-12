public class Aquarium {
    private String waterType;
    private int volumeInLiters;
    private String lighting;
    private String fishSpecies;

    Aquarium(String waterType, int volumeInLiters, String lighting, String fishSpecies) {
        this.waterType = waterType;
        this.volumeInLiters = volumeInLiters;
        this.lighting = lighting;
        this.fishSpecies = fishSpecies;
    }

    @Override
    public String toString() {
        return "Aquarium: " + volumeInLiters + "L " + waterType + " water, " +
                lighting + " lighting, inhabits " + fishSpecies;
    }
}