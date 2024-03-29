package com.stripe.android.payments;

import java.lang.System;

/**
 * Representation of the device's browser capabilities. Used for determining how to handle
 * browser-based payment authentication.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/BrowserCapabilities;", "", "(Ljava/lang/String;I)V", "CustomTabs", "Unknown", "payments-core_release"})
public enum BrowserCapabilities {
    /*public static final*/ CustomTabs /* = new CustomTabs() */,
    /*public static final*/ Unknown /* = new Unknown() */;
    
    BrowserCapabilities() {
    }
}