import java.util.Arrays;

public class MinCoins {
    public static void main(String[] args) {
        int amount = 11;
        int[] denominations = {1, 2, 5};
        System.out.println(minCoinsIterative(amount, denominations));
    }

    public static String minCoinsIterative(int amount, int[] denominations) {
        int count = 0;
        while (amount > 0) {
            int maxCoin = -1;
            for (int coin : denominations) {
                if (coin <= amount && (maxCoin == -1 || coin > maxCoin)) {
                    maxCoin = coin;
                }
            }
            if (maxCoin == -1) {
                return "NOT POSSIBLE";
            }
            amount -= maxCoin;
            count++;
        }
        return String.valueOf(count);
    }
}
