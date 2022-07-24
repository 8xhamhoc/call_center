package org.quangphan.callcenter.demo.domain;

import java.util.List;

public abstract class CallRouting {

    public abstract void register(CallHandler callHandler);

    public abstract void register(List<CallHandler> callHandlers);

    public abstract void enqueue(Call call);

    public abstract void dequeue();
}
