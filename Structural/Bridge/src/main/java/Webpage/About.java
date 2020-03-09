package Webpage;

import Theme.Theme;

public class About implements WebPage {
    protected Theme t;
    public About(Theme a) {
        this.t=a;
    }

    @Override
    public String getContent() {
        return "About page in " +this.t.getColor();
    }
}
