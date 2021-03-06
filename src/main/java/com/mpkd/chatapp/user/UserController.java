package com.mpkd.chatapp.user;

import com.mpkd.chatapp.user.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    private final UserFacade userFacade;

    UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @PostMapping("/user/post")
    void postUser(@RequestBody UserDTO user) {
        userFacade.postUser(user);
    }


}
