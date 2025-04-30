package task.M4D30;

import OtherCode.PerTools.FlexibleRead;

import java.util.HashMap;
import java.util.Map;

public class demo01 {
    public static void main(String[] args) {
        Map<Integer, String> goods = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();
        Map<Integer, Integer> cart = new HashMap<>();

        goods.put(1001, "手机");
        goods.put(1002, "电脑");
        goods.put(1003, "鼠标");
        goods.put(1004, "路由器");
        goods.put(1005, "键盘");
        goods.put(1006, "苹果");
        goods.put(1007, "葡萄");
        goods.put(1008, "冰箱");
        goods.put(1009, "电视");
        goods.put(1010, "空调");
        goods.put(1011, "电饭煲");

        map2.put(1001, 1999.0);
        map2.put(1002, 3500.0);
        map2.put(1003, 25.0);
        map2.put(1004, 50.0);
        map2.put(1005, 100.0);
        map2.put(1006, 1.5);
        map2.put(1007, 9.0);
        map2.put(1008, 2000.0);
        map2.put(1009, 999.0);
        map2.put(1010, 1500.0);
        map2.put(1011, 300.0);

        while (true) {
            System.out.println("商品列表:");
            int i = 0;
            for (Map.Entry<Integer, String> entry : goods.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue() + "  " + map2.get(entry.getKey()) + "元  ");
                i++;
                if (i % 3 == 0) {
                    System.out.println();
                }
            }
            System.out.println("-----------------------");

            while (true) {
                System.out.println("请输入要购买的商品编号:(88表示结束购物)");
                int choice = FlexibleRead.readInt();
                if (choice == 88) {
                    System.out.println("已退出购物车");
                    break;
                }
                if (goods.containsKey(choice)) {
                    System.out.println("请输入购买的商品数量:");
                    int count = FlexibleRead.readInt();
                    if (count > 0) {
                        cart.put(choice, cart.getOrDefault(choice, 0) + count);
                    } else {
                        System.out.println("请输入正确的商品数量");
                    }
                } else {
                    System.out.println("商品已下架，请重新选择");
                }
            }

            System.out.println("----购物清单---");
            System.out.println("商品\t数量\t单价\t小计");
            double amount = 0;
            int allQuantity = 0;
            for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {
                int id = entry.getKey();
                int quantity = entry.getValue();
                double price = map2.get(id);
                double subtotal = price * quantity;
                System.out.printf("%s\t%d\t%.2f\t\t%.2f\n", goods.get(id), quantity, price, subtotal);
                amount += subtotal;
                allQuantity += quantity;
            }
            System.out.println("-----------------------------------");
            System.out.printf("总件数：%d\t总价：%.2f\n", allQuantity, amount);

            System.out.println("请选择支付方式\n1.支付宝支付\n2.网银支付");
            int payment = FlexibleRead.readInt();
            if (payment == 1 || payment == 2) {
                System.out.println("支付完成！");
                break;
            }
        }
    }
}