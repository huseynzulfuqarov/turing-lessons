package org.example.Course.Module2.TaskLesson6.model;

import java.util.Objects;
import java.util.UUID;

public final class ImmutableUser {
    private final Integer id;
    private final String name;
    private final UUID uuid = UUID.randomUUID();

    public ImmutableUser(String name) {
        this.id = UUID.randomUUID().hashCode();
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableUser that = (ImmutableUser) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "ImmutableUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
