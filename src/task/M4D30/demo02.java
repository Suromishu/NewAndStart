package task.M4D30;


import java.util.*;

public class demo02 {
    public static void main(String[] args) {
        String[] colors = {"T", "X", "F", "M"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        String[] cards = new String[54];

        int index = 0;
        for (String color : colors) {
            for (String number : numbers) {
                cards[index++] = color + number;
            }
        }
        cards[index++] = "大王";
        cards[index] = "小王";

        List<String> cardList = new ArrayList<>(Arrays.asList(cards));
        Collections.shuffle(cardList);

        List<String>[] players = new List[3];
        players[0] = new ArrayList<>();
        players[1] = new ArrayList<>();
        players[2] = new ArrayList<>();

        for (int i = 0; i < 51; i++) {
            if  (i % 3 == 0) {
                players[0].add(cardList.get(i));
            } else if (i % 3 == 1) {
                players[1].add(cardList.get(i));
            } else {
                players[2].add(cardList.get(i));
            }
        }

        for (List<String> player : players) {
            Collections.sort(player, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1);
                }
            });
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("玩家" + (i + 1) + "的手牌: " + players[i]);
        }
        System.out.println("底牌: " + cardList.subList(cardList.size() - 3, cardList.size()));
    }
}