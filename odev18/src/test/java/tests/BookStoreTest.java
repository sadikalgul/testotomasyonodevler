package tests;

import helpers.BookStoreHelper;
import models.response.BookDetails;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static helpers.HelperMethods.checkStatus;

public class BookStoreTest {

    BookStoreHelper bookStoreHelper = new BookStoreHelper();
    String userId;

    @Test(description = "Get All Books",priority = 1)
    public void getAllBooks(){

        Response response = bookStoreHelper.getAllBooks();
        checkStatus(response, 200);
        //System.out.println(response.getStatusCode());
        //System.out.println("Response=>" + response.prettyPrint());
        JsonPath jsonPath = response.getBody().jsonPath();
        List<String> allBooks = jsonPath.getList("books.title");
        // Iterate over the list and print individual book item
  /*      for(String book : allBooks)
        {
            System.out.println("Book: " + book);
        }*/

        List<BookDetails> allBooksList = jsonPath.getList("books", BookDetails.class);

        // Iterate over the list and print individual book item
        // Note that every book entry in the list will be complete Json object of book
        for(BookDetails book : allBooksList)
        {
            System.out.println("Book: " + book.getTitle());
        }

    }


}
