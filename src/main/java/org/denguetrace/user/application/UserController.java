package org.denguetrace.user.application;

import org.denguetrace.user.domain.User;
import org.denguetrace.user.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {
    @RestController
    @RequestMapping("/book")
    public class BookController {
        @Autowired
        private final UserService userService;

        public BookController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping
        public ResponseEntity<List<User>> getAllBooks() {
            return ResponseEntity.ok(userService.getAllUsers());
        }

        @PostMapping
        public ResponseEntity<Void> addUser(@RequestBody User newUser) {
            userService.createUser(newUser);
            return ResponseEntity.status(HttpStatus.valueOf(201)).build();
        }
    }
}
