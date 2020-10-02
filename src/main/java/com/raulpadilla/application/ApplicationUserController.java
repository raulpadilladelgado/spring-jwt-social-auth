package com.raulpadilla.application;

import com.raulpadilla.domain.ApplicationUser;
import com.raulpadilla.infrastructure.service.ApplicationUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/users")
public class ApplicationUserController {
    private final ApplicationUserService applicationUserService;

    public ApplicationUserController(ApplicationUserService applicationUserService) {
        this.applicationUserService = applicationUserService;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser applicationUser) throws IOException, InterruptedException {
        applicationUserService.save(applicationUser);
    }
}
