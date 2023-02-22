package com.redhat.training.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.redhat.training.service.SolverService;

@ApplicationScoped
public final class Add implements BinaryOperation {
    private static final String REGEX = "(.+)\\+(.+)";
    private static final BinaryOperator<Float> OPERATOR = (lhs, rhs) -> lhs + rhs;

    public Add() {
        super(OPERATOR, REGEX);
    }
}
