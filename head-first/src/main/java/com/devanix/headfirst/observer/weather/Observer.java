package com.devanix.headfirst.observer.weather;

/**
 * Observer 인터페이스
 *  따라서 모든 옵저버는 update() 메소드를 구현해야 합니다.
 *  여기서는 측정한 값들을 전달 합니다.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
