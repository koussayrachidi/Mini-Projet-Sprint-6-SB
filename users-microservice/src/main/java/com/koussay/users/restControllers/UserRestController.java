package com.koussay.users.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.koussay.users.entities.User;
import com.koussay.users.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
@Autowired
UserService userService;
@RequestMapping(path = "all", method = RequestMethod.GET)
public List<User> getAllUsers() {
return userService.findAllUsers();
}
}