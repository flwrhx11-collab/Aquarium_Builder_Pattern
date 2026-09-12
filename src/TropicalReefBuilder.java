public class TropicalReefBuilder implements AquariumBuilder {
    private String waterType;
    private int volumeInLiters;
    private String lighting;
    private String fishSpecies;

    @Override
    public AquariumBuilder setWaterType(String waterType) { this.waterType = waterType; return this; }
    @Override
    public AquariumBuilder setVolume(int volumeInLiters) { this.volumeInLiters = volumeInLiters; return this; }
    @Override
    public AquariumBuilder setLighting(String lighting) { this.lighting = lighting; return this; }
    @Override
    public AquariumBuilder setFishSpecies(String fishSpecies) { this.fishSpecies = fishSpecies; return this; }

    @Override
    public Aquarium build() {
        if (volumeInLiters <= 0) throw new IllegalStateException("Объем должен быть больше нуля!");
        return new Aquarium(waterType, volumeInLiters, lighting, fishSpecies);
    }
}