package org.denguetrace.notification.domain;

import org.denguetrace.notification.infrastructure.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Notification findNotificationById(Long id){
        return notificationRepository.findById(id).orElseThrow(() -> new RuntimeException("Notification with id " + id + " not found"));
    }

    public void createNotification(Notification newNotification){
        notificationRepository.save(newNotification);
    }
}