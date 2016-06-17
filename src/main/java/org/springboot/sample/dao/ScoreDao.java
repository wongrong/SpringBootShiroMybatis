package org.springboot.sample.dao;

import java.util.List;

import org.springboot.sample.entity.Score;

public interface ScoreDao  {

    List<Score> getList();

}