package tests;

import helpers.BookStoreHelper;
import models.response.BookDetails;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static helpers.HelperMethods.checkStatus;
import static org.assertj.core.api.Assertions.assertThat;

public class BookStoreTest {

    BookStoreHelper bookStoreHelper = new BookStoreHelper();

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
        for(BookDetails book : allBooksList)
        {
            System.out.println("Book: " + book.getTitle());
        }
        assertThat(allBooksList.size()).isEqualTo(8); // book list size must be 8

    }

    @Test(description = "Get Max Page Books",priority = 2)
    public void getMaxPagesBooks(){
        Response response = bookStoreHelper.getAllBooks();
        checkStatus(response, 200);
        JsonPath jsonPath = response.getBody().jsonPath();
        List<BookDetails> allBooksList = jsonPath.getList("books", BookDetails.class);
        BookDetails bookDetails = allBooksList.stream().reduce((bookDetails1, bookDetails2) -> bookDetails1.getPages() > bookDetails2.getPages() ? bookDetails1:bookDetails2).get();
        assertThat(bookDetails.getTitle()).isEqualTo("Eloquent JavaScript, Second Edition"); // book list size must be 8


    }


}
