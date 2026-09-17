package org.denguetrace.notification.application;

import org.denguetrace.notification.domain.Notification;
import org.denguetrace.notification.domain.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getAllNotification() {
        return ResponseEntity.ok(notificationService.getAllNotifications());
    }

    @PostMapping
    public ResponseEntity<Void> createNotification(@RequestBody Notification newNotification) {
        notificationService.createNotification(newNotification);
        return ResponseEntity.status(HttpStatus.valueOf(201)).build();
    }
}