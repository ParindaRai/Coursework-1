/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class WeatherAppModel {
    private float Temperature;
    private float Humidity;
    private String Visibility;
    private float Pressure;
    private int WindSpeed;
    

    public WeatherAppModel() {
    }

    public WeatherAppModel(float Temperature,float Humidity, String Visibility, float Pressure, int WindSpeed) {
        this.Temperature = Temperature;
        this.Humidity = Humidity;
        this.Visibility = Visibility;
        this.Pressure = Pressure;
        this.WindSpeed = WindSpeed;
    }

    public float getTemperature() {
        return Temperature;
    }

    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public float getHumidity() {
        return Humidity;
    }

    public void setHumidity(float Humidity) {
        this.Humidity = Humidity;
    }

    public String Visibility() {
        return Visibility;
    }

    public void setVisibility(String Visibility) {
        this.Visibility = Visibility;
    }

    public float getPressure() {
        return Pressure;
    }

    public void setPressure(float Pressure) {
        this.Pressure = Pressure;
    }

    public int WindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(int WindSpeed) {
        this.WindSpeed = WindSpeed;
    }
}