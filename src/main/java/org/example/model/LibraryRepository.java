package org.example.model;

import org.example.entity.Library;

import java.util.Optional;

public interface LibraryRepository {
    Optional<Library> findById(long id);
}
