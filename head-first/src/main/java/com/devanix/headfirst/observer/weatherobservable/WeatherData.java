package com.devanix.headfirst.observer.weatherobservable;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * JDK 내장 API를 이용하면,
     * 생성자에서 옵저버들을 저장하기 위한 자료 구조를 만들 필요가 없음
     */
    public WeatherData() { }

    public void measurementsChanged() {
        // 객체의 상태가 바뀌었다는 것을 알림
        setChanged();

        // setChanged()를 호출 하지 않으면 옵저버들한테 아무 연락도 가지 않게 됨
        // notifyObservers()를 호출할 때 데이터 객체를 보내지 않습니다.(풀 모델 사용)
        // 풀(pull) 방식 : Observable 객체로부터 원하는 데이터를 가져가는 방식
        notifyObservers();
    }

    public void setMeasurements (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
