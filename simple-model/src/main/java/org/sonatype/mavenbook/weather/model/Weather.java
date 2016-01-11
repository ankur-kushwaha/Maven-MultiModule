package org.sonatype.mavenbook.weather.model;

import java.util.Date;

public class Weather {

    private Integer id;

    private Location location;

    private Condition condition;

    private Wind wind;

    private Atmosphere atmosphere;

    private Date date;
    
    public Weather() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public final Condition getCondition() { return condition; }
    public final void setCondition(final Condition newCondition) {
	this.condition = newCondition;
    }

    public Wind getWind() { return wind; }
    public void setWind(Wind wind) { this.wind = wind; }
    
    public Atmosphere getAtmosphere() { return atmosphere; }
    public void setAtmosphere(Atmosphere atmosphere) { this.atmosphere = atmosphere; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}
