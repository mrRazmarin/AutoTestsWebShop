package demowebshop.ui.pages;

import demowebshop.ui.pages.basepageelement.HeaderSection;
import demowebshop.ui.pages.basepageelement.SideBarCategories;
import demowebshop.ui.pages.basepageelement.SideBarManufacturers;
import demowebshop.ui.pages.basepageelement.SideBarPopularTags;
import demowebshop.ui.pages.homepageelements.SideBarCommunityPoll;
import demowebshop.ui.pages.homepageelements.SideBarNewsletter;
import demowebshop.ui.pages.homepageelements.SliderSection;

public class HomePage {
    public final HeaderSection headerSection = new HeaderSection();
    public final SideBarCategories sideBarCategories = new SideBarCategories();
    public final SideBarManufacturers sideBarManufacturers = new SideBarManufacturers();
    public final SideBarPopularTags sideBarPopularTags = new SideBarPopularTags();
    public final SideBarNewsletter sideBarNewsletter = new SideBarNewsletter();
    public final SideBarCommunityPoll sideBarCommunityPoll = new SideBarCommunityPoll();
    public final SliderSection sliderSection = new SliderSection();
}
