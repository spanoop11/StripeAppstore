package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "inMemorySource", "Lcom/stripe/android/cards/CardAccountRangeSource;", "remoteSource", "staticSource", "store", "Lcom/stripe/android/cards/CardAccountRangeStore;", "(Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeStore;)V", "loading", "Lkotlinx/coroutines/flow/Flow;", "", "getLoading", "()Lkotlinx/coroutines/flow/Flow;", "getAccountRange", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"})
public final class DefaultCardAccountRangeRepository implements com.stripe.android.cards.CardAccountRangeRepository {
    private final com.stripe.android.cards.CardAccountRangeSource inMemorySource = null;
    private final com.stripe.android.cards.CardAccountRangeSource remoteSource = null;
    private final com.stripe.android.cards.CardAccountRangeSource staticSource = null;
    private final com.stripe.android.cards.CardAccountRangeStore store = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> loading = null;
    
    public DefaultCardAccountRangeRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardAccountRangeSource inMemorySource, @org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardAccountRangeSource remoteSource, @org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardAccountRangeSource staticSource, @org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardAccountRangeStore store) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAccountRange(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardNumber.Unvalidated cardNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.AccountRange> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> getLoading() {
        return null;
    }
}