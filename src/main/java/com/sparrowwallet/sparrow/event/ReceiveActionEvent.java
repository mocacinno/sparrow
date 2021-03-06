package com.sparrowwallet.sparrow.event;

import com.sparrowwallet.sparrow.wallet.NodeEntry;

public class ReceiveActionEvent {
    private final NodeEntry receiveEntry;

    public ReceiveActionEvent(NodeEntry receiveEntry) {
        this.receiveEntry = receiveEntry;
    }

    public NodeEntry getReceiveEntry() {
        return receiveEntry;
    }
}
