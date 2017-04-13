package com.cantinho.cms.sqs.impl.result;

import java.util.List;

/**
 * Created by samirtf on 13/04/17.
 */
public interface ICloudiaReceiptResult<T> {

    String getRole();

    void setRole(String role);

    List<T> getReceipts();

    void setReceipts(List<T> receipts);

}
