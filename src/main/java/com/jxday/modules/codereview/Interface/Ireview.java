package com.jxday.modules.codereview.Interface;

public interface Ireview<S,T> {
    T convert(S s) throws Exception;
}