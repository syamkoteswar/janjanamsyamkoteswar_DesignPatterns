package Webpage;

import Theme.Theme;

public class Careers implements WebPage {
    protected Theme t;
    public Careers(Theme a) {
        this.t=a;
    }

    @Override
    public String getContent() {
        return "Careers page in "+this.t.getColor();
    }
}
