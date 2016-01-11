package org.sonatype.mavenbook.weather.model;

public class Atmosphere {

    private Integer id;

    private String humidity;
    private String visibility;
    private String pressure;
    private String rising;
    
    private Weather weather;

    public Atmosphere() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public final String getHumidity() {	return humidity; }
    public final void setHumidity(final String newHumidity) {
	this.humidity = newHumidity;
    }

    public final String getVisibility() { return visibility; }
    public final void setVisibility(final String newVisibility) {
	this.visibility = newVisibility;
    }

    public final String getPressure() { return pressure; }
    public final void setPressure(final String newPressure) {
	this.pressure = newPressure;
    }

    public final String getRising() { return rising; }
    public final void setRising(final String newRising) {
	this.rising = newRising;
    }
    
    public Weather getWeather() { return weather; }
    public void setWeather(Weather weather) { this.weather = weather; }
    
}