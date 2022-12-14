package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimpleApplication {
    // Wstrzykiwanie przez kostruktor
//    private SkypeMessageService messageService;
//
//    public SimpleApplication(SkypeMessageService messageService) {
//        this.messageService = messageService;
//    }
//
//    public String processMessage(String message, String receiver){
//        if(checkReceiver(receiver)){
//            return this.messageService.send(message, receiver);
//        }
//        return null;
//    }
//
//    private boolean checkReceiver(String receiver){
//        return receiver != null && !receiver.isEmpty();
//    }

    // Wstrzykiwanie do pola
//    @Autowired
//    private SkypeMessageService messageService;
//
//    public String processMessage(String message, String receiver){
//        if(checkReceiver(receiver)){
//            return this.messageService.send(message, receiver);
//        }
//        return null;
//    }
//
//    private boolean checkReceiver(String receiver){
//        return receiver != null && !receiver.isEmpty();
//    }

    // Wstrzykiwanie za pomocą settera
//    private SkypeMessageService messageService;
//
//    @Autowired
//    public void setMessageService(SkypeMessageService messageService) {
//        this.messageService = messageService;
//    }
//
//    public String processMessage(String message, String receiver){
//        if(checkReceiver(receiver)){
//            return this.messageService.send(message, receiver);
//        }
//        return null;
//    }
//
//    private boolean checkReceiver(String receiver){
//        return receiver != null && !receiver.isEmpty();
//    }
    @Autowired
    @Qualifier(value = "skypeMessageService")
    private MessageService messageService;

    public String processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            return this.messageService.send(message, receiver);
        }
        return null;
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
