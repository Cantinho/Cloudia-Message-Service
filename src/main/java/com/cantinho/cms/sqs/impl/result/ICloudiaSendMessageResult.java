package com.cantinho.cms.sqs.impl.result;

/**
 * Created by samirtf on 13/04/17.
 */
public interface ICloudiaSendMessageResult {

    String getId();

    void setId(String id);

    String getType();

    void setType(String type);

    String getTimestamp();

    void setTimestamp(String timestamp);

}
