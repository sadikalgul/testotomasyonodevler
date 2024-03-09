package helpers;

import com.robotdreams.clients.RestAssuredClient;
import com.robotdreams.config.BookStoreAPIConstant_2;
import io.restassured.response.Response;

public class BookStoreHelper extends RestAssuredClient {
    public BookStoreHelper() {
        super(BookStoreAPIConstant_2.APIUrl.BASE_URL);
    }

    public Response getAllBooks(){
        return get("/Books/",null,null,null);
    }

}

