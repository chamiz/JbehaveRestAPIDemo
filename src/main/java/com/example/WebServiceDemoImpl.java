package com.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

/**
 * JbehaveRestAPIDemo
 * Created by Chamila Ambahera on 03/7/2023.
 * chamila.ambahera@gmail.com
 */

public class WebServiceDemoImpl {

    private static String restUri;
    private static Response response;

    public static void setRestURI(String url) {
        restUri = url;
    }

    /**
     * Send Request
     */

    public static void sendRequest() {
        RestAssured.defaultParser = Parser.JSON;
        response = given().
                headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                when().get(restUri).
                then().assertThat().statusCode(200).
                contentType(ContentType.JSON).extract().response();
    }

    /**
     * Validate Name
     *
     * @param name name
     */

    public static void validateName(String name) {
        String responseName = response.jsonPath().getString("Name");
        System.out.println("Name ::: " + responseName);
        Assert.assertEquals("Name validation failed", name, responseName);
    }

    /**
     * Validate CanReList
     *
     * @param canReList canReList
     */

    public static void validateCanReList(String canReList) {
        String responseCanRelist = response.jsonPath().getString("CanRelist");
        System.out.println("CanReList ::: " + responseCanRelist);
        Assert.assertEquals("CanReList validation failed", canReList, responseCanRelist);
    }


    /**
     * Validate Promotions
     *
     * @param name        name
     * @param description description
     */

    public static void validatePromotions(String name, String description) {
        String resDescription = response.jsonPath().getString("Promotions.find{it.Name == '" + name + "'}.Description");
        System.out.println("Promotion Description ::: " + resDescription);
        assertThat("Promotion description validation failed", resDescription, containsString(description));
    }
}