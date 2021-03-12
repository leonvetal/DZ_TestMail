package com.it.letter;

public class Unread {
   public String xp;
   public String subj;

    public Unread(String xp, String subj) {
        this.xp = xp;
        this.subj = subj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Unread unread = (Unread) o;

        if (xp != null ? !xp.equals(unread.xp) : unread.xp != null) return false;
        return subj != null ? subj.equals(unread.subj) : unread.subj == null;
    }

    @Override
    public int hashCode() {
        int result = xp != null ? xp.hashCode() : 0;
        result = 31 * result + (subj != null ? subj.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Unread{" +
                "xp='" + xp + '\'' +
                ", subj='" + subj + '\'' +
                '}';
    }
}
