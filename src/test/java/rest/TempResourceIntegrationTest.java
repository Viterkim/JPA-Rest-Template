
package rest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.parsing.Parser;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.core.IsEqual.equalTo;

public class TempResourceIntegrationTest {
    
    @BeforeClass
    public static void setUpBeforeAll() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/JAXTemp/";
        RestAssured.defaultParser = Parser.JSON;
    }
//    
//    @Test
//    public void serverIsRunning() {
//        given().when().get("api/temp/").then().statusCode(200);
//    }
}
