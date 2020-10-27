package net.tacs.game.model.dto;

import java.util.Objects;

public class NextUserTurnDTO {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NextUserTurnDTO that = (NextUserTurnDTO) o;
        return username.equals(that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return "NextUserTurnDTO{" +
                "username='" + username + '\'' +
                '}';
    }
}
