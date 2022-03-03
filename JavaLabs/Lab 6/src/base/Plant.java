package base;

public class Plant {
        boolean needsWatering;
        String plantFamily;
        String name;
    

    public Plant(boolean needsWatering, String plantFamily, String name) {
        this.needsWatering = true;
        this.plantFamily = plantFamily;
        this.name = name;
        wateringInstructions();
        sunlightRequirements();
    }

    public void wateringInstructions(){
        System.out.println ("This plant should be watered every 2 days.");

    }

    public void sunlightRequirements(){
        System.out.println ("The plant needs sunlight for 8 hours.");
    }

}
