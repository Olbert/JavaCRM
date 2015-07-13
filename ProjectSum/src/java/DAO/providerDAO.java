package DAO;

import java.sql.SQLException;
import java.util.List;

import Logic.provider;

public interface providerDAO {
    public void addprovider(provider prov) throws SQLException;   //добавить поставщика
    public void updateprovider(provider prov) throws SQLException;//обновить поставщика
    public provider getproviderById(Long id) throws SQLException;    //получить поставщика по id
    public List getAllproviders() throws SQLException;              //получить всех поставщиков
    public void deleteprovider(provider prov) throws SQLException;//удалить поставщика
}