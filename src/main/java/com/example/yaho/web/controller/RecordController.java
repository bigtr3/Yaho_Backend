package com.example.yaho.web.controller;

import com.example.yaho.domain.Record;
import com.example.yaho.service.RecordService.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/records")
@Api(value = "Record Management", tags = {"Record"})
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping
    @ApiOperation(value = "Create a new record", response = Record.class)
    public Record createRecord(@RequestParam Long memberId,
                               @RequestParam String totalGames,
                               @RequestParam String winningGames) {
        return recordService.createRecord(memberId, totalGames, winningGames);
    }
}
