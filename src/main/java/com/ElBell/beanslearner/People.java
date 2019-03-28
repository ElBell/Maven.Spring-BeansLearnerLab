package com.ElBell.beanslearner;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList = new ArrayList<>();

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType... personTypes) {
        if (personList != null) {
            personList.addAll(Arrays.asList(personTypes));
        }
    }

    public void add(PersonType person) {
        if (person != null) {
            personList.add(person);
        }
    }

    public PersonType findById(long id) {
        for (PersonType person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(PersonType person) {
        if (person != null) {
            personList.remove(person);
        }
    }

    public Integer size() {
        return personList.size();
    }

    public void addAll(Iterable<PersonType> personTypes) {
        personList.addAll(Lists.newArrayList(personTypes));
    }

    public void clear() {
        personList.clear();
    }

    public List<PersonType> findAll() {
        return personList;
    }

    public List<PersonType> getPersonList() {
        return personList;
    }

    public void setPersonList(List<PersonType> personList) {
        this.personList = personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
