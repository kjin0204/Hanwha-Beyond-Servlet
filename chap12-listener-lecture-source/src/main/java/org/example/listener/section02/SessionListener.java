package org.example.listener.section02;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener , HttpSessionAttributeListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated");
        System.out.println("sessionCreated, id=" + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("sessionDestroyed");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("session attribute add");
        System.out.println("session에 추가 된 attr: " + event.getName() + ", value: " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("session attribute remove");
        System.out.println("session에 삭제 된 attr: " + event.getName() + ", value: " + event.getValue());

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("session attribute replace");
        System.out.println("session에 수정 전 attr: " + event.getName() + ", value: " + event.getValue());
        System.out.println("session에 수정 된 attr: " + event.getName() + ", value: " + event.getSession().getAttribute(event.getName()));
    }

}
