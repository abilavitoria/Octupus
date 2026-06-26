package com.octupus.pilot.service;

public interface CrudMapper<T, REQ, RES> {
    T toEntity(REQ request);

    RES toResponse(T save);
}
