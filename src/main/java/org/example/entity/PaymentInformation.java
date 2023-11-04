package org.example.entity;

public class PaymentInformation {
    private String cardHolderName;
    private short cvv;
    private PaymentExpireDate expireDate;
    private long cardNumber;

    public PaymentInformation() {}

    public PaymentInformation(final String cardHolderName,
                              final short cvv,
                              final PaymentExpireDate expireDate,
                              final long cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expireDate = expireDate;
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(final String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public short getCvv() {
        return cvv;
    }

    public void setCvv(final short cvv) {
        this.cvv = cvv;
    }

    public PaymentExpireDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(final PaymentExpireDate expireDate) {
        this.expireDate = expireDate;
    }

    public void setCardNumber(final long cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "PaymentInformation{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", cvv=" + cvv +
                ", expireDate=" + expireDate +
                ", cardNumber=" + cardNumber +
                '}';
    }

    public long getCardNumber() {
        return this.cardNumber;
    }
}
