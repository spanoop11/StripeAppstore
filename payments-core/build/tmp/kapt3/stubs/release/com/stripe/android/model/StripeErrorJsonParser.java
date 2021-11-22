package com.stripe.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeErrorJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/StripeError;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"})
public final class StripeErrorJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.StripeError> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.StripeErrorJsonParser.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MALFORMED_RESPONSE_MESSAGE = "An improperly formatted error response was found.";
    private static final java.lang.String FIELD_CHARGE = "charge";
    private static final java.lang.String FIELD_CODE = "code";
    private static final java.lang.String FIELD_DECLINE_CODE = "decline_code";
    private static final java.lang.String FIELD_DOC_URL = "doc_url";
    private static final java.lang.String FIELD_ERROR = "error";
    private static final java.lang.String FIELD_MESSAGE = "message";
    private static final java.lang.String FIELD_PARAM = "param";
    private static final java.lang.String FIELD_TYPE = "type";
    
    public StripeErrorJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.StripeError parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/StripeErrorJsonParser$Companion;", "", "()V", "FIELD_CHARGE", "", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_ERROR", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_TYPE", "MALFORMED_RESPONSE_MESSAGE", "getMALFORMED_RESPONSE_MESSAGE$payments_core_release$annotations", "payments-core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getMALFORMED_RESPONSE_MESSAGE$payments_core_release$annotations() {
        }
    }
}