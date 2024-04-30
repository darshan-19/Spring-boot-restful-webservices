package net.javaguides.springboot.repository;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    User user;


    @BeforeEach
    void setUp() {
          user=new User(1l,"Darshan","Mangle","darshanmangle@gmail.com");
        userRepository.save(user)
    }

    @AfterEach
    void tearDown() {
            user=null;
            userRepository.deleteAll();
    }
    @Test
    void testFindByEmail_Found()
    {
      Optional<User> email= userRepository.findByEmail("darshansmiling@gmail.com");
        assertThat(email.get()).isEqualTo(user.getEmail());
    }


}
