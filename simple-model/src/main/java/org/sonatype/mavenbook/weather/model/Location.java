package org.sonatype.mavenbook.weather.model;

public class Location {
    
    private String zip;

    private String city;
    private String region;
    private String country;

    public Location() {}

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }
    
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    
    public String getRegion() {	return region; }
    public void setRegion(String region) { this.region = region; }
    
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

}