package step3;

import step3.domain.Ladder;
import step3.domain.Users;
import step3.view.InputView;
import step3.view.ResultView;


public class LadderGameMain {
    public static void main(String[] args) {
        Users users = new Users(InputView.inputUsers());
        Ladder ladder = new Ladder(InputView.inputLadderHeight(),users.getUserCounts());
        ResultView.printLadderGame(users, ladder);
    }

}