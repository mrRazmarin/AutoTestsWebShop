package demowebshop.pages;

import demowebshop.pages.homepageelements.HeaderSection;
import demowebshop.pages.homepageelements.SideBarCategories;
import demowebshop.pages.homepageelements.SideBarManufacturers;
import demowebshop.pages.homepageelements.SideBarPopularTags;

public class HomePage {
    public final HeaderSection headerSection = new HeaderSection();
    public final SideBarCategories sideBarCategories = new SideBarCategories();
    public final SideBarManufacturers sideBarManufacturers = new SideBarManufacturers();
    public final SideBarPopularTags sideBarPopularTags = new SideBarPopularTags();
}
