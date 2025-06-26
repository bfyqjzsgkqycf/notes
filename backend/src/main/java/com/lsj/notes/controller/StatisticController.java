package com.lsj.notes.controller;

import com.lsj.notes.model.base.ApiResponse;
import com.lsj.notes.model.dto.statistic.StatisticQueryParam;
import com.lsj.notes.model.entity.Statistic;
import com.lsj.notes.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StatisticController {

    @Autowired
    StatisticService statisticService;

    @GetMapping("/statistic")
    public ApiResponse<List<Statistic>> getStatistic(@Valid StatisticQueryParam queryParam) {
        return statisticService.getStatistic(queryParam);
    }
}
