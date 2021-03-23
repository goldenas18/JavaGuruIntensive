package io.github.javaGuruIntensive;

import org.slf4j.LoggerFactory;

public class UserValidationService {
    public static org.slf4j.Logger logger = LoggerFactory.getLogger(User.class);


    public void ageValidation(User user) {
        if (user.getAge() > 120 || user.getAge() < 0) {
            logger.info("nooo way hi/her is that age");
            throw new UnacceptableUserAgeException("nooo way hi/her is that age");
        }
        if (user.getFirstName().length() < 3 || user.getFirstName().length() > 15) {
            logger.info("what? that`s not a name, or your parents have weird sense of humor");
            throw new UserFirstNameLenghtException("what? that`s not a name, or your parents have weird sense of humor");
        }
        if (user.getLastName().length() < 3 || user.getLastName().length() > 15) {
            logger.info("i`m not fall for that. give me your real lastname");
            throw new UserLastNameLenghtException("i`m not fall for that. give me your real lastname");
        }

    }


}
