// Generated by view binder compiler. Do not edit!
package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.stripe.android.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class CardBrandSpinnerMainBinding implements ViewBinding {
  @NonNull
  private final AppCompatImageView rootView;

  @NonNull
  public final AppCompatImageView image;

  private CardBrandSpinnerMainBinding(@NonNull AppCompatImageView rootView,
      @NonNull AppCompatImageView image) {
    this.rootView = rootView;
    this.image = image;
  }

  @Override
  @NonNull
  public AppCompatImageView getRoot() {
    return rootView;
  }

  @NonNull
  public static CardBrandSpinnerMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardBrandSpinnerMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_brand_spinner_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardBrandSpinnerMainBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    AppCompatImageView image = (AppCompatImageView) rootView;

    return new CardBrandSpinnerMainBinding((AppCompatImageView) rootView, image);
  }
}
