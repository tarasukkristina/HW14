package by.it.academy;

import java.time.LocalDate;

public record Basket(Good[] purchasedGoods, LocalDate purchaseDate) {
}
