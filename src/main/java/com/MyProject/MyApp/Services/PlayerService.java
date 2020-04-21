package com.MyProject.MyApp.Services;

import com.MyProject.MyApp.Model.Performance;
import com.MyProject.MyApp.Model.Players;
import com.MyProject.MyApp.Model.Team;
import com.MyProject.MyApp.dao.PlayersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class PlayerService {
    @Autowired
    private PlayersDao playersDao;

    public Players addPlayers(Players player) {

        return playersDao.save(player);

    }

    public List<Players> getPlayersWithDetails() {

        return playersDao.findAll();
    }

    public Players getUpdate(int pid, Players p) {
        if (p.getPlayersId() == pid) {
            playersDao.save(p);
        }
        return p;
    }
}

