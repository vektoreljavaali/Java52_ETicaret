package com.vektorel.utils;

import java.util.List;

public interface IGENERICCRUD<T> {    
    public boolean Save(T t);
    public boolean Update(T t);   
    public boolean Delete(long id, T t);
    public List<T> MyList(T t);
    public List<T> Find(T t);
    public T Search(String ColumName, Object FindKey, T t);
    
}
