public class Main {
    public static void main(String[] args) {
        AquariumDirector director = new AquariumDirector();

        AquariumBuilder reefBuilder = new TropicalReefBuilder();
        director.constructLuxuryReef(reefBuilder);
        System.out.println("Director build: " + reefBuilder.build().toString());

        AquariumBuilder customBuilder = new DesktopGoldfishBuilder();
        Aquarium customAquarium = customBuilder.setWaterType("Freshwater").setVolume(15)
                .setLighting("RGB LED").setFishSpecies("Betta Fish").build();
        System.out.println("Custom build: " + customAquarium.toString());
    }
}