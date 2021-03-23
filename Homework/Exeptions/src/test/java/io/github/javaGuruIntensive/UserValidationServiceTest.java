package io.github.javaGuruIntensive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserValidationServiceTest {



    UserValidationService userValidationService = new UserValidationService();
    User user3 = new User(123, "LongestFirstNameEver", "LongestLastNameEver");

    @Test
    void userService() {
        try {
            userValidationService.ageValidation(user3);
        } catch (UnacceptableUserAgeException e) {
            e.printStackTrace();
        }
    }

    @Test
    void userService2() throws UserValidationException {
        Assertions.assertThrows(UserValidationException.class, () -> {
            userValidationService.ageValidation(user3);
        });
    }


}