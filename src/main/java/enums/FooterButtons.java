package enums;

public enum FooterButtons {
    HOME(0), NEWS(1), REVIEWS(2), COMPARE(3), COVERAGE(4),
    GLOSSARY(5), FAQ(6);

    FooterButtons(int footerElement) {
        this.footerElement = footerElement;
    }

    private final int footerElement;

    public int getFooterElement() {
        return footerElement;
    }
}
