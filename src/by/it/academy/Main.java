package by.it.academy;

import java.time.LocalDate;
//Интернет-магазин Создать класс Товар, имеющий переменные
//имя, цена, рейтинг.
//● Создать класс Категория, имеющий переменные имя и массив
//товаров.
//● Создать несколько объектов класса Категория.
//● Создать класс Basket, содержащий массив купленных товаров и дату покупки
public class Main {
    public static void main(String[] args) {

        Good pen = new Good("Pen", 2, Rating.LOW);
        Good pencil = new Good("Pencil", 1, Rating.LOW);
        Good paper = new Good("Paper", 5, Rating.AVARAGE);
        Good dress = new Good("Dress", 50, Rating.HIGH);
        Good trousers = new Good("Trousers", 40, Rating.AVARAGE);
        Good sweater = new Good("Sweater", 35, Rating.AVARAGE);
        Good banana = new Good("Banana", 2, Rating.HIGH);
        Good orange = new Good("Orange", 4, Rating.AVARAGE);
        Good apple = new Good("Apple", 3, Rating.HIGH);

        Good[] goodsOffice = {pen, pencil, paper};
        Good[] goodsCloth = {dress, trousers, sweater};
        Good[] goodsFruits = {banana, orange, apple};

        Category categoryOffice = new Category("Office", goodsOffice);
        Category categoryCloth = new Category("Cloth", goodsCloth);
        Category categoryFruits = new Category("Fruits", goodsFruits);

        Good[] purchasedGoods = {dress, orange, paper};

        LocalDate purchaseDate = LocalDate.now();
        Basket basket = new Basket(purchasedGoods, purchaseDate);

        printInfoCategory(categoryOffice);
        printInfoCategory(categoryCloth);
        printInfoCategory(categoryFruits);

        printInfoBasket(basket, purchaseDate);
    }


    public static void printInfoCategory(Category category) {
        System.out.println("Category " + category.name() + " contains:");
        for (Good good : category.goods()) {
            System.out.println("Name good is " + good.name());
        }
        System.out.println("\n");
    }


    public static void printInfoBasket(Basket basket, LocalDate purchaseDate) {

        System.out.println("Purchased goods " + purchaseDate);

        for (Good el : basket.purchasedGoods()) {
            System.out.println("Name purchased good is " + el.name() + ", price - " + el.price() + "$, rating - " + el.rating());
        }

        // Возможно ли здесь указать категорию на каждый купленный товар?

    }

}
