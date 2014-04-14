/**
 * 
 */
package uk.ac.ox.cs.GPT9.augox;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;

public class GalleryPickerFragment extends Fragment {

	public GalleryPickerFragment(PlaceData place0, PlaceData place1,
			PlaceData place2) {
		this.place0 = place0;
		this.place1 = place1;
		this.place2 = place2;
	}

	private PlaceData place, place0, place1, place2;
	private RadioButton chosenPlace0, chosenPlace1, chosenPlace2;
	private ImageView placeImage0, placeImage1, placeImage2;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.gallery_picker, null);

		// Here we are fetching the layoutParams from parent activity and
		// setting it to the fragment's view.

		chosenPlace0 = (RadioButton) getView().findViewById(R.id.chosenPlace0);
		chosenPlace1 = (RadioButton) getView().findViewById(R.id.chosenPlace1);
		chosenPlace2 = (RadioButton) getView().findViewById(R.id.chosenPlace2);

		placeImage0 = (ImageView) getView().findViewById(R.id.placeImage0);
		placeImage1 = (ImageView) getView().findViewById(R.id.placeImage1);
		placeImage2 = (ImageView) getView().findViewById(R.id.placeImage2);

		chosenPlace0.setText(place0.getName());
		chosenPlace1.setText(place1.getName());
		chosenPlace2.setText(place2.getName());

		/*
		 * placeImage0.setImage(place0.getName());
		 * placeImage1.setImage(place1.getName());
		 * placeImage2.setImage(place2.getName());
		 */
		return view;
	}

	public PlaceData getSelectedPlace() {
		return place;
	}

}