import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostmanServiceTest {

    @Test
    public void shouldReturnData(){
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Меня зовут Дмитрий") // отправляемые данные (заголовки и query можно выставлять аналогично)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Меня зовут Александр"));
    }


}
