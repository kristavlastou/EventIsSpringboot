package com.example.demo.Service;

import com.example.demo.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Μέθοδος για να πάρουμε όλα τα events από τη βάση δεδομένων
    public List<Event> getAllEvents() {
        String sql = "SELECT * FROM EVENT";
        return jdbcTemplate.query(sql, (ResultSet rs, int rowNum) -> {
            return new Event(
                    rs.getInt("event_id"),
                    rs.getString("name"),
                    rs.getDate("date").toLocalDate(),
                    rs.getTime("time").toLocalTime(),
                    rs.getString("city"),
                    rs.getString("place"),
                    rs.getDouble("entrancePrice"),
                    rs.getString("category"),
                    rs.getString("description")
            );
        });
    }

    // Μέθοδος για να πάρουμε ένα event με το συγκεκριμένο ID
    public Event getEventById(int id) {
        String sql = "SELECT * FROM EVENT WHERE event_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (ResultSet rs, int rowNum) -> {
            return new Event(
                    rs.getInt("event_id"),
                    rs.getString("name"),
                    rs.getDate("date").toLocalDate(),
                    rs.getTime("time").toLocalTime(),
                    rs.getString("city"),
                    rs.getString("place"),
                    rs.getDouble("entrancePrice"),
                    rs.getString("category"),
                    rs.getString("description")
            );
        });
    }
}

