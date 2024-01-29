package io.github.tundeadetunji.regsys.iterator;

import io.github.tundeadetunji.regsys.visitor.IEmployee;

public interface IPaymentIterator {
    boolean hasNext();
    IEmployee next();
}
