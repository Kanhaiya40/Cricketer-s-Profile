package com.MyProject.MyApp.api;
import com.MyProject.MyApp.Model.Players;
import com.MyProject.MyApp.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CricketersProfile")
public class MyAppResource {
    @Autowired
    private PlayerService service;
    @PostMapping("/addDetails")
    public String addPlayers(@RequestBody Players p)
    {
        service.addPlayers(p);
        return "Player added to the Database";
    }

    @GetMapping("/getPlayers")
    public List<Players> getPlayers()
    {
        return service.getPlayersWithDetails();
    }
    @PutMapping("/updatePlayers/{pid}")
    public Players getUpdated(@PathVariable("pid") int pid,@RequestBody Players p)

    {
       return service.getUpdate(pid,p);
    }

}
