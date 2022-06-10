package com.devanix.headfirst.observer.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {

    /** 온도 */
    private float temperature;
    /** 습도 */
    private float humidity;
    /** 기압 */
    private float pressure;

    /** 옵저버 객체 저장용 */
    private ArrayList observer;

    public WeatherData() {
        this.observer = new ArrayList();
    }

    /**
     * 옵저버 등록
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observer.add(o);
    }

    /**
     * 옵저버 탈퇴
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observer.indexOf(o);
        if ( i >= 0) {
            observer.remove(o);
        }
    }

    /**
     * 옵저버 알림
     */
    @Override
    public void notifyObservers() {
        for (int i=0; i<observer.size(); i++) {
            Observer observer = (Observer) this.observer.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들한테 알림
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 디스플레이 항목 테스트
     *      기상 스테이션 대신 측정값 설정
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

        // 기타 WeatherData 메소드
    }
}
