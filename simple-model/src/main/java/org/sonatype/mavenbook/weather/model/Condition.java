package org.sonatype.mavenbook.weather.model;

public class Condition {

    private Integer id;

    private String text;
    private String code;
    private String temp;
    private String date;

    private Weather weather;

    public Condition() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public  String getText() { return text; }
    public  void setText( String newText) {
	this.text = newText;
    }

    public  String getCode() { return code; }
    public  void setCode( String newCode) {
	this.code = newCode;
    }

    public  String getTemp() { return temp; }
    public  void setTemp( String newTemp) {
	this.temp = newTemp;
    }

    public  String getDate() { return date; }
    public  void setDate( String newDate) {
	this.date = newDate;
    }

    public Weather getWeather() { return weather; }
    public void setWeather(Weather weather) { this.weather = weather; }

}