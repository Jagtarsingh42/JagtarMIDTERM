/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *
 * @author jagta
 */

public enum StatusCode {
    ZERO("REJECTED"),
    ONE("PENDING"),
    TWO("PROCESSING"),
    THREE("APPROVED"),
    FOUR("COMPLETED");

    private final String message;

    StatusCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}