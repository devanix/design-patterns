package com.devanix.headfirst.observer.weather;

/**
 * 현재 기상 조건 표시하는 디스플레이
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 생성자에 weatherData 라는 주제 객체가 전달되며,
     * 그 객체를 써서 디스플레이를 옵저버로 등록
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 기온과 습도를 저장하고 display()를 호출
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /**
     * 가장 최근에 얻은 기온과 습도를 출력
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

}
