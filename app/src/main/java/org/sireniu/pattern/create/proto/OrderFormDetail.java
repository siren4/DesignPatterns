package org.sireniu.pattern.create.proto;

import androidx.annotation.NonNull;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/5
 */
public class OrderFormDetail implements Cloneable {
    private String userAddress;
    private String userName;
    private String phoneNumber;

    @NonNull
    @Override
    public OrderFormDetail clone() {
        try {
            return (OrderFormDetail) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
