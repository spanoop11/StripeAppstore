package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodPreferenceForSetupIntentJsonParser;", "Lcom/stripe/android/model/parsers/PaymentMethodPreferenceJsonParser;", "Lcom/stripe/android/model/SetupIntent;", "()V", "stripeIntentFieldName", "", "getStripeIntentFieldName", "()Ljava/lang/String;", "parseStripeIntent", "stripeIntentJson", "Lorg/json/JSONObject;", "payments-core_release"})
public final class PaymentMethodPreferenceForSetupIntentJsonParser extends com.stripe.android.model.parsers.PaymentMethodPreferenceJsonParser<com.stripe.android.model.SetupIntent> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stripeIntentFieldName = "setup_intent";
    
    public PaymentMethodPreferenceForSetupIntentJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getStripeIntentFieldName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.SetupIntent parseStripeIntent(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject stripeIntentJson) {
        return null;
    }
}