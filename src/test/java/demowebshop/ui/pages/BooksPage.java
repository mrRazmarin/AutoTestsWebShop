package demowebshop.ui.pages;

import demowebshop.ui.pages.bookpageelements.FilterByPriceSection;
import demowebshop.ui.pages.bookpageelements.HeaderBooksPage;
import demowebshop.ui.pages.bookpageelements.ListDiscountPercent;

public class BooksPage extends BasePageElements{
    public final FilterByPriceSection filterByPriceSection = new FilterByPriceSection();
    public final HeaderBooksPage headerBooksPage = new HeaderBooksPage();
    public ListDiscountPercent listDiscountPercent = new ListDiscountPercent();
}
