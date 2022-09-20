package org.example.web.app.services;

import java.util.List;

import org.example.web.dto.Book;

public interface ProjectRepository<T> {
    List<T> retrieveAll();
    void store(T book);

    boolean removeItemById(Integer bookIdToRemove);
}
