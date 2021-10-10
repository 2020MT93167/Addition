package com.scalable.addition.service;

import com.scalable.addition.domain.AdditionRequest;
import com.scalable.addition.domain.AdditionResponse;

public interface AdditionService {
    AdditionResponse response(AdditionRequest request) throws Exception;
}
