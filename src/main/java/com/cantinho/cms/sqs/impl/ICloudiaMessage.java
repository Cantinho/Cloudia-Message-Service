package com.cantinho.cms.sqs.impl;

import java.util.List;

/**
 * Created by samirtf on 13/04/17.
 */
public interface ICloudiaMessage {

    IActor getSender();

    void setSender(IActor sender);

    List<IActor> getReceivers();

    void setReceivers(List<IActor> receivers);

    String getMessage();

    void setMessage(String message);

}
