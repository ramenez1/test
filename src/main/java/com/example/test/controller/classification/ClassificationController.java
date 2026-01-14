package com.example.test.controller.classification;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.test.entity.Classification;
import com.example.test.mapper.ClassificationMapper;
import com.example.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classification")
public class ClassificationController {

    @Autowired
    private ClassificationMapper classificationMapper;

    @PostMapping("/getNavigation.do")
    public List<Classification> getNavigation() {
        // 既然用户很在意 SQL，我们加上排序，通常这种菜单都有个 sort 字段或者按 id 排序
        QueryWrapper<Classification> wrapper = new QueryWrapper<>();

        // 尝试按 id 排序，保证菜单顺序固定
        wrapper.orderByAsc("id");

        return classificationMapper.selectList(wrapper);
    }
}