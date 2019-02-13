package com.bdg.hhertevtsyan.BookStorage.services;

import com.bdg.hhertevtsyan.BookStorage.Book;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.BookCreateParameter;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.BookUpdateParameter;

public abstract class AbstractBookService {

    public abstract Book get (final int id);
    public abstract  Book create (final BookCreateParameter params);
    public abstract Book update (final BookUpdateParameter params);
    public abstract boolean delete (final int id);
}
