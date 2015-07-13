package DAO;

import java.sql.SQLException;
import java.util.List;

import Logic.fabricator;

public interface fabricatorDAO {
    public void addFabricator(fabricator fab) throws SQLException;   //добавить производителя
    public void updateFabricator(fabricator fab) throws SQLException;//обновить производителя
    public fabricator getFabricatorById(Long id) throws SQLException;    //получить производителя по id
    public List getAllFabricators() throws SQLException;              //получить всех производителей
    public void deleteFabricator(fabricator fab) throws SQLException;//удалить производителя
}