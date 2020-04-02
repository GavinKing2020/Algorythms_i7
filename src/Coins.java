public class Coins {
    private static int[] COINS_NOM = {1, 5, 10, 25, 50};

    public static int getCountOfWays(int money) {
        return getCountOfWays(money, 4);
    }

    /**
     * КАК ДО ТАКОГО ДОДУМАТЬСЯ???
     */
    private static int getCountOfWays(int money, int indexOfCoin) {
        if (money < 0 || indexOfCoin < 0) return 0;
        if (money == 0 || indexOfCoin == 0) return 1;
        return getCountOfWays(money, indexOfCoin - 1) + getCountOfWays(money - COINS_NOM[indexOfCoin], indexOfCoin);
    }

    public static void main(String[] args) {
        System.out.println(Coins.getCountOfWays(78));
    }

}