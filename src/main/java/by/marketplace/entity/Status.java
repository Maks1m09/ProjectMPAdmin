package by.marketplace.entity;

public enum Status {
    INPROCESSING ("In Processing"),
    COLLECTION("Collection"),
    INTRANSIT("In Transit"),
    COMPLETED ("Completed");

    private final String displayValue;

     Status(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
