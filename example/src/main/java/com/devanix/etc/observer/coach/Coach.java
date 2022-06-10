package com.devanix.etc.observer.coach;

/**
 * 주제(Subject) 인터페이스
 */
public interface Coach {
    void subscribe(Crew crew);
    void unsubscribe(Crew crew);
    void notifyCrew(String msg);
}
