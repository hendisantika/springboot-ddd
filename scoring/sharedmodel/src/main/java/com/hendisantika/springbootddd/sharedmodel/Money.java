package com.hendisantika.springbootddd.sharedmodel;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-25
 * Time: 06:37
 */
public final class Money {
    private final static int DEFAULT_SCALE = 2;
    private BigDecimal amount;
    private int scale;

    public Money() {
        this(BigDecimal.ZERO);
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
        this.scale = DEFAULT_SCALE;
    }

    public Money(int amount) {
        this(new BigDecimal(amount));
    }

    public Money add(Money money) {
        BigDecimal total = this.getAmount().add(money.getAmount());

        return new Money(total);
    }

    public boolean isGreaterThan(Money comparison) {
        return this.getAmount().compareTo(comparison.getAmount()) > 0;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", scale=" + scale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return scale == money.scale &&
                Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount, scale);
    }
}

