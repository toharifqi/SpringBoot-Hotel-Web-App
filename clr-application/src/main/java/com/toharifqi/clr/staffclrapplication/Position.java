package com.toharifqi.clr.staffclrapplication;

public enum Position {
    SECURITY,
    HOUSEKEEPING,
    FRONT_DESK,
    CONCIERGE,;

    public String toString() {
        switch (this) {
            case SECURITY:
                return "Security";
            case HOUSEKEEPING:
                return "Housekeeping";
            case FRONT_DESK:
                return "FrontDesk";
            case CONCIERGE:
                return "Concierge";
        }
        return "";
    }
}
