package helpers;

import com.robotdreams.clients.RestAssuredClient;
import com.robotdreams.config.BookStoreAPIConstant;
import io.restassured.response.Response;
import models.request.BookUserRequest;

import java.util.HashMap;
import java.util.Map;

public class BookUserHelper extends RestAssuredClient {
    public BookUserHelper() {
        super(BookStoreAPIConstant.APIUrl.BASE_URL);
    }

    public Response addUser(String name, String password) {
        BookUserRequest bookUserRequest = BookUserRequest.builder()
                .userName(name)
                .password(password)
                .build();

        return post("/User", null, null, bookUserRequest);
    }

    public Response authorizeUser(String name, String password) {
        BookUserRequest bookUserRequest = BookUserRequest.builder()
                .userName(name)
                .password(password)
                .build();

        return post("/GenerateToken", null, null, bookUserRequest);
    }

    public Response getUserWithId(String id,String token){

        Map<String, Object> header = new HashMap<>();
        header.put("Authorization",token);
        return get("/User/"+id,null,header,null);
    }

}

