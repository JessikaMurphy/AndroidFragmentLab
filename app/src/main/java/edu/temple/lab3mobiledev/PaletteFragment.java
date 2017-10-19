package edu.temple.lab3mobiledev;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaletteFragment extends Fragment {


    public onColorSelectListener colorChoice;
    Activity PaletteActivity;


    public PaletteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = (View) inflater.inflate(R.layout.fragment_palette, container, false);

        Resources res = getResources();

        //String[] myArray = {"RED", "BLUE", "MAGENTA","WHITE", "CYAN","YELLOW","GREEN","BLACK","GRAY"};
        String[] myDisplayArray = res.getStringArray(R.array.my_color_display_array);
        String[] myParseArray = res.getStringArray(R.array.my_parse_array);
        GridView gridder = (GridView) v.findViewById(R.id.gridder);

        customSpinner spinner = new customSpinner(getActivity(), myDisplayArray, myParseArray);

        gridder.setAdapter(spinner);





        gridder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedColor = adapterView.getItemAtPosition(i).toString();

                try{
                    colorChoice.onColorSelected(selectedColor);
                }catch
                    (ClassCastException cce){}

            }
        });


        return v;

    }

    public interface onColorSelectListener{
        public void onColorSelected(String selectedColor);
    }

    @Override
    public void onAttach(Activity PaletteActivity)
    {
        super.onAttach(PaletteActivity);
        this.PaletteActivity = PaletteActivity;
        colorChoice = (onColorSelectListener)PaletteActivity;
    }


}
