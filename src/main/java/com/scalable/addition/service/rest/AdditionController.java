package com.scalable.addition.service.rest;

import com.scalable.addition.domain.AdditionRequest;
import com.scalable.addition.domain.AdditionResponse;
import com.scalable.addition.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdditionController {

    @Autowired
    AdditionService additionService;

    @PostMapping("/add")
    public AdditionResponse add(@RequestBody AdditionRequest request) throws Exception {
        if (request.getFirstOperand() != null && request.getSecondOperand() != null)
            return additionService.response(request);
        else
         return new AdditionResponse();
    }
}
