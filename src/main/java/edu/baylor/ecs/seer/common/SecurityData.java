package edu.baylor.ecs.seer.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * This is a DTO for the Security module. It is currently unused, as the Security module does not return data
 * that is more complex than a string.
 */
@Data
@NoArgsConstructor
public class SecurityData implements Serializable {

    /**
     * This is the HTTP status of the request.
     */
    private int status;

    /**
     * This is the HTTP message from the request.
     */
    private String message;

    /**
     * This is the actual data returned by the request.
     */
    private String data;

}
