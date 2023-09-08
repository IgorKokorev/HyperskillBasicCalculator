// Generated by view binder compiler. Do not edit!
package org.hyperskill.calculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.hyperskill.calculator.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addButton;

  @NonNull
  public final Button button0;

  @NonNull
  public final Button button1;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button button7;

  @NonNull
  public final Button button8;

  @NonNull
  public final Button button9;

  @NonNull
  public final Button clearButton;

  @NonNull
  public final EditText displayEditText;

  @NonNull
  public final Button divideButton;

  @NonNull
  public final Button dotButton;

  @NonNull
  public final Button equalButton;

  @NonNull
  public final Button multiplyButton;

  @NonNull
  public final Button subtractButton;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button addButton,
      @NonNull Button button0, @NonNull Button button1, @NonNull Button button2,
      @NonNull Button button3, @NonNull Button button4, @NonNull Button button5,
      @NonNull Button button6, @NonNull Button button7, @NonNull Button button8,
      @NonNull Button button9, @NonNull Button clearButton, @NonNull EditText displayEditText,
      @NonNull Button divideButton, @NonNull Button dotButton, @NonNull Button equalButton,
      @NonNull Button multiplyButton, @NonNull Button subtractButton) {
    this.rootView = rootView;
    this.addButton = addButton;
    this.button0 = button0;
    this.button1 = button1;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.button8 = button8;
    this.button9 = button9;
    this.clearButton = clearButton;
    this.displayEditText = displayEditText;
    this.divideButton = divideButton;
    this.dotButton = dotButton;
    this.equalButton = equalButton;
    this.multiplyButton = multiplyButton;
    this.subtractButton = subtractButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addButton;
      Button addButton = ViewBindings.findChildViewById(rootView, id);
      if (addButton == null) {
        break missingId;
      }

      id = R.id.button0;
      Button button0 = ViewBindings.findChildViewById(rootView, id);
      if (button0 == null) {
        break missingId;
      }

      id = R.id.button1;
      Button button1 = ViewBindings.findChildViewById(rootView, id);
      if (button1 == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button7;
      Button button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.button8;
      Button button8 = ViewBindings.findChildViewById(rootView, id);
      if (button8 == null) {
        break missingId;
      }

      id = R.id.button9;
      Button button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.clearButton;
      Button clearButton = ViewBindings.findChildViewById(rootView, id);
      if (clearButton == null) {
        break missingId;
      }

      id = R.id.displayEditText;
      EditText displayEditText = ViewBindings.findChildViewById(rootView, id);
      if (displayEditText == null) {
        break missingId;
      }

      id = R.id.divideButton;
      Button divideButton = ViewBindings.findChildViewById(rootView, id);
      if (divideButton == null) {
        break missingId;
      }

      id = R.id.dotButton;
      Button dotButton = ViewBindings.findChildViewById(rootView, id);
      if (dotButton == null) {
        break missingId;
      }

      id = R.id.equalButton;
      Button equalButton = ViewBindings.findChildViewById(rootView, id);
      if (equalButton == null) {
        break missingId;
      }

      id = R.id.multiplyButton;
      Button multiplyButton = ViewBindings.findChildViewById(rootView, id);
      if (multiplyButton == null) {
        break missingId;
      }

      id = R.id.subtractButton;
      Button subtractButton = ViewBindings.findChildViewById(rootView, id);
      if (subtractButton == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, addButton, button0, button1,
          button2, button3, button4, button5, button6, button7, button8, button9, clearButton,
          displayEditText, divideButton, dotButton, equalButton, multiplyButton, subtractButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
