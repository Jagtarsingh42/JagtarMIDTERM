/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */

public enum StatusUser {
    ZERO("REJECTED"),
    ONE("PENDING"),
    TWO("PROCESSING"),
    THREE("APPROVED"),
    FOUR("COMPLETED");

    private final String message;

    StatusUser(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}

 
