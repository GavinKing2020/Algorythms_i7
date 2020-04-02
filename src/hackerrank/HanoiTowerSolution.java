package hackerrank;

public class HanoiTowerSolution {

    private  static void solveTower(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {
            // move a disc from the fromPeg to the tempPeg
            solveTower(num - 1, fromPeg, tempPeg, toPeg);

            System.out.println("Disc moved from " + fromPeg + " to " + toPeg);

            // move disc from the tempPeg to the toPeg
            solveTower(num - 1, tempPeg, toPeg, fromPeg);
        }
    }

    public static void main(String[] args) {
        solveTower(4, 1, 3, 2);
    }
}
