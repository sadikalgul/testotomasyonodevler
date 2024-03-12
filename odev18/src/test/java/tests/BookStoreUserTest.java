package tests;

import helpers.BookUserHelper;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static helpers.HelperMethods.checkStatus;
import static org.assertj.core.api.Assertions.assertThat;

public class BookStoreUserTest {

    BookUserHelper bookUserHelper = new BookUserHelper();
    String userId;
    String authorizeId;

    @Test(description = "Add New User",priority = 1)
    public void addNewBookStoreUser(){

        Response response = bookUserHelper.addUser("sadik1918","Sa123456$?");
        checkStatus(response, 201);
        //System.out.println(response.getStatusCode());
        assertThat(response.jsonPath().getString("username")).isEqualTo("sadik1918");
        userId = response.jsonPath().getString("userID");
        System.out.println(userId);
    }

    @Test(description = "Authorized New User",priority = 2)
    public void authorizeNewBookStoreUser(){

        Response response = bookUserHelper.authorizeUser("sadik1918","Sa123456$?");
        checkStatus(response, 200);
        //System.out.println(response.getStatusCode());
       // assertThat(response.jsonPath().getString("username")).isEqualTo("sadik1905");
       // userId = response.jsonPath().getString("userID");
        authorizeId = response.jsonPath().getString("token");
        System.out.println("token" + authorizeId);
    }


    @Test(description = "Get User By Id",priority = 3)
    public void getBookStoreUser(){

        Response response = bookUserHelper.getUserWithId(userId,authorizeId);
        //Response response = bookUserHelper.getUserWithId("a7a512e7-b403-453f-9eeb-8d62d504b1d4");
        checkStatus(response, 200);
        //System.out.println(response.getStatusCode());
        assertThat(response.jsonPath().getString("username")).isEqualTo("sadik1918");
    }

}
