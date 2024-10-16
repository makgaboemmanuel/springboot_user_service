package com.phorscode.user.service.user_service;

import com.phorscode.user.service.user_service.client_services.Notifications;
import com.phorscode.user.service.user_service.client_services.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*
* Please use the following to access the endpoint: http://localhost:8080/user/1
* */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/{userId}")
    public User getUser(@PathVariable("userId") String userId){
        User userOne = new User(userId, "Emmanuel", "xxxxxxxxxx");
        /* calling the respective Post the client */
        Posts posts =  restTemplate.getForObject(
                "http://localhost:8081/post/" + userId, Posts.class);
        userOne.setPosts(posts);

        /* calling the respective the Notification client */
        Notifications notification =  restTemplate.getForObject(
                "http://localhost:8082/notification/" + userId, Notifications.class);
        userOne.setNotifications(notification);

        return userOne;
    }
}
