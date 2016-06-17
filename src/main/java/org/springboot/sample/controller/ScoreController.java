package org.springboot.sample.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.sample.dao.ScoreDao;
import org.springboot.sample.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class ScoreController {

    private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

    @Autowired
    private ScoreDao scoreService;

    @RequestMapping("/scoreList")
    public List<Score> getScoreList(){

        return scoreService.getList();
    }
}
