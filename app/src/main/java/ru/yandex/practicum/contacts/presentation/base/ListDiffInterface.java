package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T newItem); //по совету поправил o на newItem для читаемости, спасибо

    boolean equals(Object o);
}
