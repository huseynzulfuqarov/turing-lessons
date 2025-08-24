package org.example.Course.Module2.TaskLesson6.model;

import java.util.Objects;
import java.util.UUID;

public final class ImmutableUser {
    private final int id;
    private final String name;
    private final UUID uuid = UUID.randomUUID();

    public ImmutableUser(String name) {
        this.id = UUID.randomUUID().hashCode();
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableUser that = (ImmutableUser) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, uuid);
    }

    @Override
    public String toString() {
        return "ImmutableUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}
