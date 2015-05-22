/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.utah.dhs.dwight.utility;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response status
 * @author rdarbham
 */
public class Response {

    private Status status;
    private String messages;

    public Response() {
    }

    public Response(Status status, String messages) {
        this.status = status;
        this.messages = messages;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
}
