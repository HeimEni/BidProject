package com.tp.BidProject.repositories;

import com.tp.BidProject.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDAO implements ProductDAOInterface{

    private final String getProductByid = "SELECT * FROM PRODUCT WHERE id_PRODUCT = :id_PRODUCT;";
    private final String getAll = "SELECT * FROM PRODUCT;";
    private final String insertProduct = "INSERT INTO PRODUCT (name_product,description,starting_value,path_image) VALUES (:name_product,:description,:starting_value,:path_image);";
    @Autowired
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public ProductDAO(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Product getProductByid(Integer id) {
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("id_PRODUCT", id);
        return jdbcTemplate.queryForObject(getProductByid, sqlParameterSource, new ProductRowMapper());
    }

    @Override
    public List<Product> getAll() {
        return jdbcTemplate.query(getAll, new ProductRowMapper());
    }

    @Override
    public boolean insertProduct(Product product) {
        KeyHolder keyHolder =  new GeneratedKeyHolder();
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("name_product", product.getName());
        sqlParameterSource.addValue("description", product.getDescription());
        sqlParameterSource.addValue("starting_value", product.getStartingvalue());
        sqlParameterSource.addValue("path_image", product.getPathToImg());
        //jdbcTeamlplte.update return numbers of affected lines
        if(jdbcTemplate.update(insertProduct, sqlParameterSource) == 1){
                return true;
        }
        return false;
    }

    @Override
    public boolean updateProduct(Integer id, Product product) {
        return false;
    }
    public class ProductRowMapper implements RowMapper<Product> {

        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product p = new Product();
            p.setId(rs.getInt("id_PRODUCT"));
            p.setDescription(rs.getString("description"));
            p.setName(rs.getString("name_product"));
            p.setStartingvalue(rs.getLong("starting_value"));
            p.setPathToImg(rs.getString("path_image"));
            return p;
        }
    }
}
