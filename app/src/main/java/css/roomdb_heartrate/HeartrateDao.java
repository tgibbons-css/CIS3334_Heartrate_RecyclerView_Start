package css.roomdb_heartrate;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface HeartrateDao {
    @Query("SELECT * FROM Heartrate")
    List<Heartrate> getAll();

    @Insert
    void insert(Heartrate heartrate);

    @Delete
    void delete(Heartrate heartrate);

    @Query("DELETE FROM Heartrate")
    void deleteAll();

    @Query("SELECT * FROM Heartrate WHERE id = :Id")
    Heartrate getByIds(int Id);

}
