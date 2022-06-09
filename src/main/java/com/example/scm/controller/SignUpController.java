package com.example.scm.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.scm.entity.Race;
import com.example.scm.entity.StudentTeam;
import com.example.scm.entity.Team;
import com.example.scm.entity.TeamRace;
import com.example.scm.service.StudentTeamService;
import com.example.scm.service.TeamRaceService;
import com.example.scm.service.TeamService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("signUp")
public class SignUpController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TeamService teamService;
    @Resource
    private TeamRaceService teamRaceService;
    @Resource
    private StudentTeamService studentTeamService;

    /**
     * 新增数据
     *
     * @param param 实体对象
     * @return 新增结果
     */
    @Transactional
    @PostMapping
    public R insert(@RequestBody Map<String, Object> param) {
        // 报名信息：比赛、团队、队员
        Race race = JSONObject.parseObject(param.get("race").toString(), Race.class);
        Team team = JSONObject.parseObject(param.get("team").toString(), Team.class);
        List<Integer> idList = JSONObject.parseArray(param.get("idList").toString(), Integer.class);

        teamService.save(team);

        TeamRace teamRace = new TeamRace();
        teamRace.setRaceId(race.getId());
        teamRace.setTeamId(team.getId());

        teamRaceService.save(teamRace);
        List<StudentTeam> studentTeamList = new ArrayList<>();
        for (int i = 0; i < idList.size(); i++){
            StudentTeam studentTeam = new StudentTeam();
            studentTeam.setTeamId(team.getId());
            studentTeam.setStudentId(idList.get(i));
            studentTeamList.add(studentTeam);
        }
        studentTeamService.insertBatch(studentTeamList);

        return success(team);
    }
}
