package org.quangphan.callcenter.demo.domain;

import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        RespondentRouting respondentRouting = new RespondentRouting();
        ManagerRouting managerRouting = new ManagerRouting();
        DirectorRouting directorRouting = new DirectorRouting();

        List<CallHandler> respondents = initRespondents(managerRouting);
        List<CallHandler> managers = initManagers(directorRouting);
        List<CallHandler> directors = initDirectors(null);

        respondentRouting.register(respondents);
        managerRouting.register(managers);
        directorRouting.register(directors);


        for (int i=0; i<20; i++) {
            String clientName = "client" + i;
            ClientCall clientCall = new ClientCall(clientName, respondentRouting, i);
            clientCall.start();
        }
    }

    private static List<CallHandler> initRespondents(CallRouting callRouting) {
        List<CallHandler> respondents = new LinkedList<>();

        for (int i=0; i< 10; i++) {
            String name = "Respondent" + i;
            respondents.add(new Respondent(name, callRouting));
        }

        return respondents;
    }

    private static List<CallHandler> initManagers(CallRouting callRouting) {
        List<CallHandler> managers = new LinkedList<>();

        for (int i=0; i< 5; i++) {
            String name = "Manager" + i;
            managers.add(new Manager(name, callRouting));
        }

        return managers;
    }


    private static List<CallHandler> initDirectors(CallRouting callRouting) {
        List<CallHandler> directors = new LinkedList<>();

        for (int i=0; i< 3; i++) {
            String name = "Director" + i;
            directors.add(new Director(name, callRouting));
        }

        return directors;
    }

}
