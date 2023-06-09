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

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView ivDogG;

  @NonNull
  public final TextView tvAgeG;

  @NonNull
  public final TextView tvDogG;

  @NonNull
  public final TextView tvHobbyG;

  private GridListItemBinding(@NonNull MaterialCardView rootView, @NonNull ImageView ivDogG,
      @NonNull TextView tvAgeG, @NonNull TextView tvDogG, @NonNull TextView tvHobbyG) {
    this.rootView = rootView;
    this.ivDogG = ivDogG;
    this.tvAgeG = tvAgeG;
    this.tvDogG = tvDogG;
    this.tvHobbyG = tvHobbyG;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_dog_g;
      ImageView ivDogG = ViewBindings.findChildViewById(rootView, id);
      if (ivDogG == null) {
        break missingId;
      }

      id = R.id.tv_age_g;
      TextView tvAgeG = ViewBindings.findChildViewById(rootView, id);
      if (tvAgeG == null) {
        break missingId;
      }

      id = R.id.tv_dog_g;
      TextView tvDogG = ViewBindings.findChildViewById(rootView, id);
      if (tvDogG == null) {
        break missingId;
      }

      id = R.id.tv_hobby_g;
      TextView tvHobbyG = ViewBindings.findChildViewById(rootView, id);
      if (tvHobbyG == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, ivDogG, tvAgeG, tvDogG, tvHobbyG);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
