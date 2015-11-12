package quinnpommerening.com.criminalintent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

public class DatePickerFragment extends DialogFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        Dialog dialog;
        AlertDialog.Builder builder;

        View v = getActivity().getLayoutInflater()
                .inflate(R.layout.fragment_date_picker, null);

        builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.date_picker_title)
                .setView(v)
                .setPositiveButton(android.R.string.ok, null);
        dialog = builder.create();
        return dialog;
    }
}

