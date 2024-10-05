package demowebshop.ui.configuration;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ConfigurationData {

    /**
     * <h3>Side-bar 'Categories'</h3>
     */

    public static final String BOOKS = "books";
    public static final String COMPUTERS = "computers";
    public static final String ELECTRONICS = "electronics";
    public static final String APPAREL_AND_SHOES = "apparel-shoes";
    public static final String DIGITAL_DOWNLOADS = "digital-downloads";
    public static final String JEWELRY = "jewelry";
    public static final String GIFT_CARDS = "gift-cards";

    private static final String booksNameCategory = "Books";
    private static final String computersNameCategory = "Computers";
    private static final String electronicsNameCategory = "Electronics";
    private static final String apparelAndShoesNameCategory = "Apparel & Shoes";
    private static final String digitalDownloadsNameCategory = "Digital downloads";
    private static final String jewelryNameCategory = "Jewelry";
    private static final String giftCardsNameCategory = "Gift Cards";


    public static Stream<Arguments> sideBarCategoriesList(){
        return Stream.of(
                Arguments.of(BOOKS, booksNameCategory),
                Arguments.of(COMPUTERS, computersNameCategory),
                Arguments.of(ELECTRONICS, electronicsNameCategory),
                Arguments.of(APPAREL_AND_SHOES, apparelAndShoesNameCategory),
                Arguments.of(DIGITAL_DOWNLOADS, digitalDownloadsNameCategory),
                Arguments.of(JEWELRY, jewelryNameCategory),
                Arguments.of(GIFT_CARDS, giftCardsNameCategory)
        );
    }
}
