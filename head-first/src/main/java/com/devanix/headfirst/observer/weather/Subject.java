package com.devanix.headfirst.observer.weather;

public interface Subject {
    /**
     * 옵저버 등록
     * @param o
     */
    public void registerObserver (Observer o);

    /**
     * 옵저버 제거
     * @param o
     */
    public void removeObserver (Observer o);

    /**
     * 주제(Subject)객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기 위해 호출되는 메서드
     */
    public void notifyObservers();
}
