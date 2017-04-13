package com.cantinho.cms.sqs.impl;

import com.cantinho.cms.sqs.impl.request.*;
import com.cantinho.cms.sqs.impl.result.*;

/**
 * Created by samirtf on 13/04/17.
 */
public interface ICloudiaMessageQueue {

    ICloudiaSendMessageResult sendMessage(ICloudiaMessage iCloudiaMessage);

    ICloudiaReceiptResult sendMessage(ICloudiaSendMessageRequest iCloudiaSendMessageRequest);

    ICloudiaReceiptBatchResult sendMessage(ICloudiaSendMessageBatchRequest iCloudiaSendMessageBatchRequest);

    ICloudiaReceiveMessageResult receiveMessage(IActor iActor);

    ICloudiaReceiveMessageResult receiveMessage(ICloudiaReceiveMessageRequest iCloudiaReceiveMessageRequest);

    ICloudiaDeleteMessageResult deleteMessage(IActor iActor, String receiptHandle);

    ICloudiaDeleteMessageResult deleteMessage(ICloudiaDeleteMessageRequest iCloudiaDeleteMessageRequest);

    ICloudiaDeleteMessageBatchResult deleteMessage(ICloudiaDeleteMessageBatchRequest iCloudiaDeleteMessageBatchRequest);

    ICloudiaReceiptResult peekMessage(IActor iActor);

    ICloudiaListQueuesResult listQueues();

    ICloudiaListQueuesResult listQueues(IActor iActor);

    ICloudiaListQueuesResult listQueues(ICloudiaListQueuesRequest iCloudiaListQueuesRequest);

    ICloudiaCreateQueueResult createQueue(IActor iActor);

    ICloudiaCreateQueueResult createQueue(ICloudiaCreateQueueRequest iCloudiaCreateQueueRequest);

    void shutdown();

}
