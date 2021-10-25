package org.siren.pattern.create.proto;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/2
 */
public class OrderFormCard implements Cloneable {
    private String orderId;
    private OrderFormDetail orderFormDetail;

    public OrderFormCard(String orderId, OrderFormDetail orderFormDetail) {
        System.out.println("++OrderForm构造函数被执行了++");
        this.orderId = orderId;
        this.orderFormDetail = orderFormDetail;
    }

    @Override
    public OrderFormCard clone() {
        try {
            OrderFormCard card = (OrderFormCard) super.clone();
            card.orderFormDetail = this.orderFormDetail.clone();
            return card;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
