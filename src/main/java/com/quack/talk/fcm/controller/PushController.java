package com.quack.talk.fcm.controller;

import com.quack.talk.common.fcm.dto.NotificationRequestDto;
import com.quack.talk.common.fcm.dto.SubscriptionRequestDto;
import com.quack.talk.fcm.service.PushService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = {"/noti"})
public class PushController {

    private final PushService service;

    @PostMapping("/subscribe")
    public ResponseEntity subscribeToTopic(@RequestBody SubscriptionRequestDto subscriptionRequestDto) {
        service.subscribeToTopic(subscriptionRequestDto);
        return ResponseEntity.ok(null);
    }

    @PostMapping("/unsubscribe")
    public ResponseEntity unsubscribeFromTopic(SubscriptionRequestDto subscriptionRequestDto) {
        service.unsubscribeFromTopic(subscriptionRequestDto);
        return ResponseEntity.ok(null);
    }

    @PostMapping("/token")
    public ResponseEntity sendPnsToDevice(@RequestBody NotificationRequestDto notificationRequestDto) {
        String res = service.sendPnsToDevice(notificationRequestDto);
        return ResponseEntity.ok(res);
    }

    @PostMapping("/topic")
    public ResponseEntity sendPnsToTopic(@RequestBody NotificationRequestDto notificationRequestDto) {
        String res = service.sendPnsToTopic(notificationRequestDto);
        return ResponseEntity.ok(res);
    }
}
