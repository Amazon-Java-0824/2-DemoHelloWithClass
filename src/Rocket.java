public class Rocket {

    private String targetPlanet;

    public void travelToSpace(){
        System.out.println("Traveling to Space");
    }

    public void travelToSpace(String targetPlanet){
        System.out.println("Traveling to " + targetPlanet);
    }

    public void travelToSpace(String targetPlanet, String reason){
        System.out.println("Traveling to " + targetPlanet + " to " + reason);
    }

    public Rocket(String targetPlanet) {
        this.targetPlanet = targetPlanet;
    }

    public String getTargetPlanet() {
        return targetPlanet;
    }

    public void setTargetPlanet(String targetPlanet) {
        this.targetPlanet = targetPlanet;
    }
}
