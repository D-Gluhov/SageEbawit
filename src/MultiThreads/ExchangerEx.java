package MultiThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendList1 = new ArrayList<>();
        friendList1.add(Action.BUMAGA);
        friendList1.add(Action.KAMEN);
        friendList1.add(Action.KAMEN);
        List<Action> friendList2 = new ArrayList<>();
        friendList2.add(Action.KAMEN);
        friendList2.add(Action.BUMAGA);
        friendList2.add(Action.NOJNICI);

        new Employee("ROMA", friendList1, exchanger);
        new Employee("PETYA", friendList2, exchanger);
    }
}


enum Action {
    KAMEN, NOJNICI, BUMAGA;
}


class Employee extends Thread {
    private String name;
    private List<Action> listActions;
    private Exchanger<Action> ex;

    public Employee(String name, List<Action> listActions, Exchanger<Action> ex) {
        this.name = name;
        this.listActions = listActions;
        this.ex = ex;
        this.start();
    }

    private void whoWins(Action myAction, Action otherAction) {
        if (myAction == Action.BUMAGA && otherAction == Action.KAMEN
                || myAction == Action.KAMEN && otherAction == Action.NOJNICI
                || myAction == Action.NOJNICI && otherAction == Action.BUMAGA) {
            System.out.println(name + " WINS !!!");
        }
    }


    @Override
    public void run() {
        Action reply;
        for (Action action : listActions) {
            try {
                reply = ex.exchange(action);
                whoWins(action, reply);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
