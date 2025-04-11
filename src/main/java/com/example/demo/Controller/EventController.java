package com.example.demo.Controller;

import com.example.demo.Event;
import com.example.demo.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




import java.util.List;

@Controller
public class EventController {

    // Object of  service to access the events 
    @Autowired
    private EventService eventService;

    // Endpoint for all the  events
    @GetMapping("/events")
    public String getAllEvents(Model model) {
        List<Event> events = eventService.getAllEvents();
        model.addAttribute("events", events);  

        return "events";  // Return events.html
    }

    
    @GetMapping("/events/{eventID}")
    public String getEventDetails(@PathVariable String eventID, Model model) {
        int id;
        id = Integer.parseInt(eventID);
        Event event = eventService.getEventById(id);  // Take an event with a specific ID
        model.addAttribute("event", event);  // Add the event in model
        return "event-details";  
    }
}

