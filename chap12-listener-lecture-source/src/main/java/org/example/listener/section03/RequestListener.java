package org.example.listener.section03;


import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener , ServletRequestAttributeListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request initialized");
    }


    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("request에 추가된 attr : " + srae.getName() + " , value : " + srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("request에 삭제된 attr : " + srae.getName() + " , value : " + srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("request에 수정 전 attr : " + srae.getName() + " , value : " + srae.getValue());
        System.out.println("request에 수정 후 attr : " + srae.getName() + " , value : "
                + srae.getServletRequest().getAttribute(srae.getName()));
    }

}
