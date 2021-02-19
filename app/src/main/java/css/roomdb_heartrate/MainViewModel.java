package css.roomdb_heartrate;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private HeartrateRepository heartrateRepository;


    public MainViewModel(@NonNull Application application) {
        super(application);
        heartrateRepository = new HeartrateRepository(application);
        heartrateRepository.getAllHeartrates();
    }

    public void insert(Integer heartRate, Integer age) {
        Heartrate hr = new Heartrate(heartRate, age);
        heartrateRepository.insert(hr);
    }

    public Integer getNumberRates() {
        return heartrateRepository.getNumberRates();
    }

    public Heartrate getHeartRate(Integer position) {
        return heartrateRepository.getHeartRate(position);
    }

}
