public class AquariumDirector {
    public void constructLuxuryReef(AquariumBuilder builder) {
        builder.setWaterType("Marine").setVolume(500).setLighting("Blue LED").setFishSpecies("Clownfish and Tangs");
    }
    public void constructStarterKit(AquariumBuilder builder) {
        builder.setWaterType("Freshwater").setVolume(20).setLighting("Basic White").setFishSpecies("Goldfish");
    }
}