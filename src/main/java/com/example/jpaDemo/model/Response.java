/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.jpaDemo.model;

/**
 *
 * @author psalvi
 */
public class Response {
    private String statusCode;
    private String description;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Response(String statusCode, String description) {
        this.statusCode = statusCode;
        this.description = description;
    }
}
