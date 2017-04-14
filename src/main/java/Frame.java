public class Frame {
    private int score;
    private int turn1 = 0;
    private int turn2 = 0;



    public int getTurn1() {
        return turn1;
    }

    public void setTurn1(int turn1) {
        this.turn1 = turn1;
    }

    public int getTurn2() {
        return turn2;
    }

    public void setTurn2(int turn2) {
        this.turn2 = turn2;
    }


    public Frame() {
        score = 0;
    }

    public void calculateFrameScore() {
        score = turn1 + turn2;
    }

    public boolean isItAStrike() {
        return turn1 == 10;
    }

    public boolean isItASpare() {
        return turn1 + turn2 == 10;
    }
}
