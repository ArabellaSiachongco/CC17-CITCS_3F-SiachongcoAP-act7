package com.example.final2mycityapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.final2mycityapp.Park;
import com.example.final2mycityapp.R;

import java.util.ArrayList;
import java.util.List;

public class ParksViewModel extends ViewModel {
    private final MutableLiveData<List<Park>> parks;

    public ParksViewModel() {
        parks = new MutableLiveData<>();
        loadParks();
    }

    private void loadParks() {
        List<Park> parkList = new ArrayList<>();

        // Updated titles and descriptions based on typical features of the images
        parkList.add(new Park("Burnham Park",
                "A renowned park in Baguio known for its scenic lake, boating, and lush gardens. It’s a perfect spot for picnics and relaxation.",
                R.drawable.burnhampark)); // Make sure R.drawable.burnhampark exists

        parkList.add(new Park("Botanical Garden",
                "A serene botanical garden showcasing a variety of plants and flowers, perfect for a leisurely stroll and appreciating nature.",
                R.drawable.botanical)); // Ensure R.drawable.botanical exists

        parkList.add(new Park("La Trinidad Strawberry Farm",
                "Located just outside Baguio, this farm allows visitors to pick strawberries and enjoy the beautiful fields.",
                R.drawable.sanctuary)); // Ensure R.drawable.sanctuary exists

        parks.setValue(parkList);
    }

    public LiveData<List<Park>> getParks() {
        return parks;
    }
}