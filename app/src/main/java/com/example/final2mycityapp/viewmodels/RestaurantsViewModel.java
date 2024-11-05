package com.example.final2mycityapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.final2mycityapp.R;
import com.example.final2mycityapp.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsViewModel extends ViewModel {
    private final MutableLiveData<List<Restaurant>> restaurants;

    public RestaurantsViewModel() {
        restaurants = new MutableLiveData<>();
        loadRestaurants();
    }

    private void loadRestaurants() {
        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("Good Taste Café & Restaurant", "Known for its affordable meals and great service.", R.drawable.good_taste));
        restaurantList.add(new Restaurant("Foggy Mountain Cookhouse", "Offers delicious dishes with a scenic view.", R.drawable.fmc_coffee));
        restaurantList.add(new Restaurant("Farmer’s Daughter Restaurant", "Famous for its home-cooked meals using fresh ingredients.", R.drawable.forest));

        restaurants.setValue(restaurantList);
    }

    public LiveData<List<Restaurant>> getRestaurants() {
        return restaurants;
    }
}
