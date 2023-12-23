package org.example.manager;

import org.example.db.DBConnectionProvider;
import org.example.model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    Connection connection = DBConnectionProvider.getInstance().getConnection();

    public void add(Category category) {

        String query = "insert into category(name) values(?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, category.getName());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Category getCategoryById(int id) {
        String sql = "SELECT * FROM category WHERE id=" + id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Category category = new Category(id, name);
                return category;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Category> getAllCategories() {
        String sql = "SELECT * FROM category";
        List<Category> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Category category = new Category(id, name);
                result.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public void deleteCategoryById(int id) {
        if (getCategoryById(id) == null) {
            System.out.println("category with " + id + "-id dose not exists");
            return;
        }
        String sql = "delete from category where id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            System.out.println("category was removes");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void updateCategory(Category category) {
        if (getCategoryById(category.getId()) == null) {
            System.out.println("category with " + category.getId() + "-id dose not exists");
            return;
        }
        String query = "UPDATE category SET name=? WHERE id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, category.getName());
            preparedStatement.setInt(2, category.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
