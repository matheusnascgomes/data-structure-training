package br.com.caelum.ed;

public class Studant {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Studant anotherOne = (Studant)o;
        return this.name.equals(anotherOne.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
