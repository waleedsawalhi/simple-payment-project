package org.example.entity;

public class PaymentExpireDate {
    private byte month;
    private short year;

    public PaymentExpireDate() {}

    public PaymentExpireDate(final byte month,
                             final short year) {
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return month + "/" + year;
    }

    public void setMonth(final byte month) {
        this.month = month;
    }

    public void setYear(final short year) {
        this.year = year;
    }

    public byte getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }
}
