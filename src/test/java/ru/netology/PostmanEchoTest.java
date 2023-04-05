package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void sentRequest (){
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("5 april 2023")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data",equalTo("6 april 2023"))
        ;
    }
}
