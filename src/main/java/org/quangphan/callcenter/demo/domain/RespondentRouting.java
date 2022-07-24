package org.quangphan.callcenter.demo.domain;

import java.util.*;

public class RespondentRouting extends CallRouting {

    private List<CallHandler> callHandlerList = new LinkedList<>();
    private Queue<Call> calls = new PriorityQueue<>(new CallComparator());
    private boolean running;

    @Override
    public void register(CallHandler callHandler) {
        callHandlerList.add(callHandler);
    }

    @Override
    public void register(List<CallHandler> callHandlers) {
        callHandlerList.addAll(callHandlers);
    }

    @Override
    public void enqueue(Call call) {
        calls.offer(call);

        if (!running) {
            running = true;
            dequeue();
        }
    }

    @Override
    public void dequeue() {
        do {
            callHandlerList.stream()
                    .filter(callHandler -> callHandler.isFree())
                    .findFirst()
                    .ifPresent(callHandler -> callHandler.handle(calls.poll()));
        } while (!calls.isEmpty());

        running = false;
    }
}
