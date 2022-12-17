package practice.day31;

import java.time.LocalDate;

public class ExpireDate {
    //when its not instantiated we can put add it to the parameter and change it using constructor.
    String productName;
    double productPrice;
    String expirationDate;

    public ExpireDate(String productName, double productPrice, int expirationDate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.expirationDate = LocalDate.now().plusMonths(expirationDate).toString();
    }

    public ExpireDate(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
