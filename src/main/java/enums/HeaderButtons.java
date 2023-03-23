package enums;

public enum HeaderButtons {
    HOME(0), NEWS(1), REVIEWS(2), VIDEOS(3), FEATURED(4),
    PHONE_FINDER(5), DEALS(6), MERCH(7), COVERAGE(8), CONTACT(9);

    HeaderButtons(int headerElement) {
        this.headerElement = headerElement;
    }

    private final int headerElement;

    public int getHeaderElement() {
        return headerElement;
    }
}
