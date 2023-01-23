package com.tp3messaoudNael.demo.consumingrest;

public class Forecast {
    private String insee;
    private long cp;
    private double latitude;
    private double longitude;
    private long day;
    private String datetime;
    private long wind10M;
    private long gust10M;
    private long dirwind10M;
    private double rr10;
    private double rr1;
    private long probarain;
    private long weather;
    private long tmin;
    private long tmax;
    private long sunHours;
    private long etp;
    private long probafrost;
    private long probafog;
    private long probawind70;
    private long probawind100;
    private long gustx;

    public String getInsee() { return insee; }
    public void setInsee(String value) { this.insee = value; }

    public long getCp() { return cp; }
    public void setCp(long value) { this.cp = value; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double value) { this.latitude = value; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double value) { this.longitude = value; }

    public long getDay() { return day; }
    public void setDay(long value) { this.day = value; }

    public String getDatetime() { return datetime; }
    public void setDatetime(String value) { this.datetime = value; }

    public long getWind10M() { return wind10M; }
    public void setWind10M(long value) { this.wind10M = value; }

    public long getGust10M() { return gust10M; }
    public void setGust10M(long value) { this.gust10M = value; }

    public long getDirwind10M() { return dirwind10M; }
    public void setDirwind10M(long value) { this.dirwind10M = value; }

    public double getRr10() { return rr10; }
    public void setRr10(double value) { this.rr10 = value; }

    public double getRr1() { return rr1; }
    public void setRr1(double value) { this.rr1 = value; }

    public long getProbarain() { return probarain; }
    public void setProbarain(long value) { this.probarain = value; }

    public long getWeather() { return weather; }
    public void setWeather(long value) { this.weather = value; }

    public long getTmin() { return tmin; }
    public void setTmin(long value) { this.tmin = value; }

    public long getTmax() { return tmax; }
    public void setTmax(long value) { this.tmax = value; }

    public long getSunHours() { return sunHours; }
    public void setSunHours(long value) { this.sunHours = value; }

    public long getEtp() { return etp; }
    public void setEtp(long value) { this.etp = value; }

    public long getProbafrost() { return probafrost; }
    public void setProbafrost(long value) { this.probafrost = value; }

    public long getProbafog() { return probafog; }
    public void setProbafog(long value) { this.probafog = value; }

    public long getProbawind70() { return probawind70; }
    public void setProbawind70(long value) { this.probawind70 = value; }

    public long getProbawind100() { return probawind100; }
    public void setProbawind100(long value) { this.probawind100 = value; }

    public long getGustx() { return gustx; }
    public void setGustx(long value) { this.gustx = value; }
}