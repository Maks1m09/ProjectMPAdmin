package by.marketplace.entity;


public enum Status {
    INPROCESSING("InProcessing"),
    COLLECTION("Collection"),
    INTRANSIT("InTransit"),
    COMPLETED("Completed");

    private final String displayValue;

    Status(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

}
