package org.example.Course.Module2.TaskLesson6.repository;

import org.example.Course.Module2.TaskLesson6.model.ImmutableUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserRepository<T extends ImmutableUser> {

    private final List<T> users = new ArrayList<>();

    public void save(T user) {
        users.add(user);
    }

    public Optional<T> findById(int id) {
        for (T user : users) {
            if (Objects.equals(user.getId(), id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public List<ImmutableUser> findAll() {
        return new ArrayList<>(users);
    }
}