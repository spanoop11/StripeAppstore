// Generated by view binder compiler. Do not edit!
package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.paymentsheet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutPaymentsheetGooglePayItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView card;

  @NonNull
  public final ImageView checkIcon;

  @NonNull
  public final ImageView googlePayMark;

  @NonNull
  public final TextView label;

  private LayoutPaymentsheetGooglePayItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView card, @NonNull ImageView checkIcon,
      @NonNull ImageView googlePayMark, @NonNull TextView label) {
    this.rootView = rootView;
    this.card = card;
    this.checkIcon = checkIcon;
    this.googlePayMark = googlePayMark;
    this.label = label;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutPaymentsheetGooglePayItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutPaymentsheetGooglePayItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_paymentsheet_google_pay_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutPaymentsheetGooglePayItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card;
      MaterialCardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.check_icon;
      ImageView checkIcon = ViewBindings.findChildViewById(rootView, id);
      if (checkIcon == null) {
        break missingId;
      }

      id = R.id.google_pay_mark;
      ImageView googlePayMark = ViewBindings.findChildViewById(rootView, id);
      if (googlePayMark == null) {
        break missingId;
      }

      id = R.id.label;
      TextView label = ViewBindings.findChildViewById(rootView, id);
      if (label == null) {
        break missingId;
      }

      return new LayoutPaymentsheetGooglePayItemBinding((ConstraintLayout) rootView, card,
          checkIcon, googlePayMark, label);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}