package com.scalable.addition.service.impl;

import com.scalable.addition.domain.AdditionRequest;
import com.scalable.addition.domain.AdditionResponse;
import com.scalable.addition.service.AdditionService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class AdditionServiceImpl implements AdditionService {
    @Override
    public AdditionResponse response(AdditionRequest request) throws Exception {
        AdditionResponse resp = new AdditionResponse();
        final BigDecimal firstOperand = getOperand(request.getFirstOperand());
        final BigDecimal secondOperand = getOperand(request.getSecondOperand());

        final BigDecimal result = firstOperand.add(secondOperand);
        resp.setResult(result.toString());
        return resp;
    }

    private BigDecimal getOperand(final BigDecimal operand ) throws Exception {
        return Optional.ofNullable(operand).orElseThrow(Exception::new);
    }
}
