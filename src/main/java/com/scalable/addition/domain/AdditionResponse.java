package com.scalable.addition.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class AdditionResponse implements Serializable {
    private static final long serialVersionUID = -6543262445504289504L;
    String result;
}
