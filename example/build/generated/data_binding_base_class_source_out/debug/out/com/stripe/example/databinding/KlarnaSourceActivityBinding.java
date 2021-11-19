// Generated by view binder compiler. Do not edit!
package com.stripe.example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class KlarnaSourceActivityBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button createButton;

  @NonNull
  public final Button fetchButton;

  @NonNull
  public final LinearProgressIndicator progressBar;

  @NonNull
  public final TextView sourceResult;

  private KlarnaSourceActivityBinding(@NonNull ScrollView rootView, @NonNull Button createButton,
      @NonNull Button fetchButton, @NonNull LinearProgressIndicator progressBar,
      @NonNull TextView sourceResult) {
    this.rootView = rootView;
    this.createButton = createButton;
    this.fetchButton = fetchButton;
    this.progressBar = progressBar;
    this.sourceResult = sourceResult;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static KlarnaSourceActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static KlarnaSourceActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.klarna_source_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static KlarnaSourceActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.create_button;
      Button createButton = ViewBindings.findChildViewById(rootView, id);
      if (createButton == null) {
        break missingId;
      }

      id = R.id.fetch_button;
      Button fetchButton = ViewBindings.findChildViewById(rootView, id);
      if (fetchButton == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      LinearProgressIndicator progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.source_result;
      TextView sourceResult = ViewBindings.findChildViewById(rootView, id);
      if (sourceResult == null) {
        break missingId;
      }

      return new KlarnaSourceActivityBinding((ScrollView) rootView, createButton, fetchButton,
          progressBar, sourceResult);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
