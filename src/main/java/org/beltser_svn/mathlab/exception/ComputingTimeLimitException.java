package org.beltser_svn.mathlab.exception;

public class ComputingTimeLimitException extends Exception {
    public ComputingTimeLimitException() {
        this("Computing duration is too long");
    }

    public ComputingTimeLimitException(String message) {
        super(message);
    }
}
