package com.cantinho.cms.sqs.impl.request;

import com.cantinho.cms.sqs.impl.ICloudiaMessage;

import java.util.List;

/**
 * Created by samirtf on 13/04/17.
 */
public interface ICloudiaSendMessageRequest {

    String getLabel();

    void setLabel(String label);

    String getRole();

    void setRole(String role);

    List<ICloudiaMessage> getMessages();

    void setMessages(List<ICloudiaMessage> messages);

    void addMessage(ICloudiaMessage message);

    ICloudiaMessage removeMessage(ICloudiaMessage message);

    void clearMessages();

}
