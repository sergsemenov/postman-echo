package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToObject;

class MobileBankApiTestPostmanEcho {
    @Test
    void shouldReturnSomeDataFromPostmanEcho() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Ten o'clock postman Make me feel better") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalToObject("Ten o'clock postman Bring me her letter"));
    }
}
