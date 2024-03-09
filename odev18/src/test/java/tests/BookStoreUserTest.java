package tests;

import helpers.BookUserHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static helpers.HelperMethods.checkStatus;
import static org.assertj.core.api.Assertions.assertThat;

public class BookStoreUserTest {

    BookUserHelper bookUserHelper = new BookUserHelper();
    String userId;

    @Test(description = "Add New User",priority = 1)
    public void addNewBookStoreUser(){

        Response response = bookUserHelper.addUser("sadik1910","Sa123456$?");
        checkStatus(response, 201);
        //System.out.println(response.getStatusCode());
        assertThat(response.jsonPath().getString("username")).isEqualTo("sadik1910");
        userId = response.jsonPath().getString("userID");
        System.out.println(userId);
    }

    @Test(description = "Authorized New User",priority = 2)
    public void authorizeNewBookStoreUser(){

        Response response = bookUserHelper.authorizeUser("sadik1910","Sa123456$?");
        checkStatus(response, 200);
        //System.out.println(response.getStatusCode());
       // assertThat(response.jsonPath().getString("username")).isEqualTo("sadik1905");
       // userId = response.jsonPath().getString("userID");
       // System.out.println(userId);
    }


    @Test(description = "Get User By Id",priority = 3)
    public void getBookStoreUser(){

        //Response response = bookUserHelper.getUserWithId(userId);
        Response response = bookUserHelper.getUserWithId("08b47b7e-3012-4039-a577-82a2e8a8dd37");
        checkStatus(response, 200);
        //System.out.println(response.getStatusCode());
        assertThat(response.jsonPath().getString("username")).isEqualTo("sadik1910");
    }

}
