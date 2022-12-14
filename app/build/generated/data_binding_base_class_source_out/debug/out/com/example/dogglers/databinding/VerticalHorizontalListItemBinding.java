// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView Age;

  @NonNull
  public final TextView Hobbis;

  @NonNull
  public final TextView Name;

  @NonNull
  public final ImageView tzeitel;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull TextView Age, @NonNull TextView Hobbis, @NonNull TextView Name,
      @NonNull ImageView tzeitel) {
    this.rootView = rootView;
    this.Age = Age;
    this.Hobbis = Hobbis;
    this.Name = Name;
    this.tzeitel = tzeitel;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Age;
      TextView Age = ViewBindings.findChildViewById(rootView, id);
      if (Age == null) {
        break missingId;
      }

      id = R.id.Hobbis;
      TextView Hobbis = ViewBindings.findChildViewById(rootView, id);
      if (Hobbis == null) {
        break missingId;
      }

      id = R.id.Name;
      TextView Name = ViewBindings.findChildViewById(rootView, id);
      if (Name == null) {
        break missingId;
      }

      id = R.id.tzeitel;
      ImageView tzeitel = ViewBindings.findChildViewById(rootView, id);
      if (tzeitel == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, Age, Hobbis, Name,
          tzeitel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
