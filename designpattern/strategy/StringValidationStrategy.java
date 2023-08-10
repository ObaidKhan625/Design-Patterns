package net.media.training.designpattern.strategy;

public interface StringValidationStrategy {
    void validate(String val, int allowedLength);
}