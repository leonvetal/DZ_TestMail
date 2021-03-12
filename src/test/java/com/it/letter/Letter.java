package com.it.letter;

public class Letter {
    public String theme;
    public String body;

    public Letter(String theme, String body) {
        this.theme = theme;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Letter letter = (Letter) o;

        if (theme != null ? !theme.equals(letter.theme) : letter.theme != null) return false;
        return body != null ? body.equals(letter.body) : letter.body == null;
    }

    @Override
    public int hashCode() {
        int result = theme != null ? theme.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "theme='" + theme + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
