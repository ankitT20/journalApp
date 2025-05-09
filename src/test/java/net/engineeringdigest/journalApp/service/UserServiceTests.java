package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

//@ActiveProfiles("dev")
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

//    @BeforeEach
//    @BeforeAll
//    @AfterEach
//    @AfterAll
//    void setUp(){
//
//    }

//    @Disabled
    @Test
    public void testFindByUserName() {
        assertEquals(4, 2 + 2);
//        assertNotNull(userRepository.findByUserName("ram"));
        assertTrue(5 > 3);
        User user = userRepository.findByUserName("ram");
        assertTrue(!user.getJournalEntries().isEmpty());
    }


//    @Disabled
    @ParameterizedTest
//    @EnumSource
    @ValueSource(strings = {
            "ram",
//            "shyam",
            "Ankit"
    })
    public void testFindByUserName2(String name) {
        assertNotNull(userRepository.findByUserName(name), "failed for: " + name);
    }


    @Disabled // Warning - will FAIL because of duplicate user, change userName in UserArgumentsProvider
    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    public void testSaveNewUser(User user) {
        assertTrue(userService.saveNewUser(user));
    }


//    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,3,6"
    })
    public void test(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }
}
