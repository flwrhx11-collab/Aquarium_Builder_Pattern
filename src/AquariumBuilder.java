public interface AquariumBuilder {
    AquariumBuilder setWaterType(String waterType);
    AquariumBuilder setVolume(int volumeInLiters);
    AquariumBuilder setLighting(String lighting);
    AquariumBuilder setFishSpecies(String fishSpecies);
    Aquarium build();
}