package application;

public class PostcodeDistance {
	private String postcode1;
    private String postcode2;
    private double distance;

    public PostcodeDistance(String postcode1, String postcode2, double distance) {
        this.postcode1 = postcode1;
        this.postcode2 = postcode2;
        this.distance = distance;
    }
    
    public String getPostcode1() {
        return postcode1;
    }

    public String getPostcode2() {
        return postcode2;
    }

    public double getDistance() {
        return distance;
    }
}
