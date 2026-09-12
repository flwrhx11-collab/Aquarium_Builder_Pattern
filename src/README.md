# Aquarium Builder Project

Simple Java project for Software Design Patterns assignment demonstrating the Builder creational pattern.
Domain: Custom Aquarium Ordering System.

## Project Structure
• Product: Aquarium class (stores water type, volume, lighting, and fish species).

• Builder: AquariumBuilder interface declaring construction steps with fluent API.

• Concrete Builders:

-TropicalReefBuilder: Builds large marine aquariums (includes volume > 0 validation).

-DesktopGoldfishBuilder: Builds small desktop setups (includes 1-50L volume validation).

• Director: AquariumDirector orchestrating preset configurations (Luxury Reef and Starter Kit).

• Client: Main class demonstrating the build process.

## How to Run
1. Open the project in IntelliJ IDEA with JDK 17 installed.
2. Run the main method in src/Main.java.
3. Check the console output to view generated aquarium setups.