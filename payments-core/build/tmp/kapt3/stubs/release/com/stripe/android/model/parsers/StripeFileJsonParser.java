package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/StripeFileJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeFile;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"})
public final class StripeFileJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.StripeFile> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.StripeFileJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ID = "id";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CREATED = "created";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_FILENAME = "filename";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PURPOSE = "purpose";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SIZE = "size";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_TITLE = "title";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_TYPE = "type";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_URL = "url";
    
    public StripeFileJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.StripeFile parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/StripeFileJsonParser$Companion;", "", "()V", "FIELD_CREATED", "", "FIELD_FILENAME", "FIELD_ID", "FIELD_PURPOSE", "FIELD_SIZE", "FIELD_TITLE", "FIELD_TYPE", "FIELD_URL", "payments-core_release"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}