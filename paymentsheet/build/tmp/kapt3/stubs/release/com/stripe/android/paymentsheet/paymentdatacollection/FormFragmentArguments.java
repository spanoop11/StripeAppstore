package com.stripe.android.paymentsheet.paymentdatacollection;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003JS\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\bH\u00c6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020$H\u00d6\u0001J\t\u0010)\u001a\u00020\bH\u00d6\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "Landroid/os/Parcelable;", "paymentMethod", "Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "showCheckbox", "", "showCheckboxControlledFields", "merchantName", "", "amount", "Lcom/stripe/android/paymentsheet/model/Amount;", "billingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "injectorKey", "(Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;ZZLjava/lang/String;Lcom/stripe/android/paymentsheet/model/Amount;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Ljava/lang/String;)V", "getAmount", "()Lcom/stripe/android/paymentsheet/model/Amount;", "getBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getInjectorKey", "()Ljava/lang/String;", "getMerchantName", "getPaymentMethod", "()Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "getShowCheckbox", "()Z", "getShowCheckboxControlledFields", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"})
public final class FormFragmentArguments implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.model.SupportedPaymentMethod paymentMethod = null;
    private final boolean showCheckbox = false;
    private final boolean showCheckboxControlledFields = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String merchantName = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.model.Amount amount = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails billingDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String injectorKey = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.SupportedPaymentMethod paymentMethod, boolean showCheckbox, boolean showCheckboxControlledFields, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantName, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.Amount amount, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.BillingDetails billingDetails, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.InjectorKey()
    java.lang.String injectorKey) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FormFragmentArguments(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.SupportedPaymentMethod paymentMethod, boolean showCheckbox, boolean showCheckboxControlledFields, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantName, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.Amount amount, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.BillingDetails billingDetails, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.InjectorKey()
    java.lang.String injectorKey) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.SupportedPaymentMethod component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.SupportedPaymentMethod getPaymentMethod() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getShowCheckbox() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getShowCheckboxControlledFields() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMerchantName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.model.Amount component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.model.Amount getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails getBillingDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInjectorKey() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments[] newArray(int size) {
            return null;
        }
    }
}