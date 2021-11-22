// Generated by Dagger (https://dagger.dev).
package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PaymentSheetCommonModule_Companion_ProvideResourcesFactory implements Factory<Resources> {
  private final Provider<Context> contextProvider;

  public PaymentSheetCommonModule_Companion_ProvideResourcesFactory(
      Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Resources get() {
    return provideResources(contextProvider.get());
  }

  public static PaymentSheetCommonModule_Companion_ProvideResourcesFactory create(
      Provider<Context> contextProvider) {
    return new PaymentSheetCommonModule_Companion_ProvideResourcesFactory(contextProvider);
  }

  public static Resources provideResources(Context context) {
    return Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.Companion.provideResources(context));
  }
}
