package dev.group1.Potlukk.RepoTests;

import dev.group1.Potlukk.entities.User;
import dev.group1.Potlukk.repos.UserRepo;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserRepoTests {

    static int id;
    @Autowired
    private UserRepo userRepo;

    @Test
    @Order(1)
    public void createUser(){
        User user = new User(0, "group1", "password");
        this.userRepo.save(user);
        UserRepoTests.id = user.getId();
        System.out.println(user);
        Assertions.assertNotEquals(0, user.getId());
    }

    @Test
    @Order(2)
    public void getUserById(){
        Optional<User> possibleUser = this.userRepo.findById(UserRepoTests.id);
        if(possibleUser.isPresent()){
            User retrievedUser = possibleUser.get();
            Assertions.assertEquals("group1", retrievedUser.getUsername());

        }else{
            System.out.println("No user found with id: " + UserRepoTests.id);
        }
    }

    @Test
    @Order(3)
    public void updateUser(){
        Optional<User> possibleUser = this.userRepo.findById(UserRepoTests.id);
        if(possibleUser.isPresent()){
            User user = possibleUser.get();
            user.setPassword("pass01");
            this.userRepo.save(user);
            Assertions.assertEquals("pass01", possibleUser.get().getPassword());
        }else{
            System.out.println("No user was found.");
        }
    }

    @Disabled
    @Test
    @Order(4)
    public void deleteUser(){
        Optional<User> possibleUser = this.userRepo.findById(UserRepoTests.id);

        if(possibleUser.isPresent()){
            this.userRepo.delete(possibleUser.get());
            Optional<User> testDeletedUser = this.userRepo.findById(UserRepoTests.id);

            Assertions.assertTrue(testDeletedUser.isEmpty());
        }else{
            System.out.println("No user found with id: " + UserRepoTests.id);
        }
    }
}
