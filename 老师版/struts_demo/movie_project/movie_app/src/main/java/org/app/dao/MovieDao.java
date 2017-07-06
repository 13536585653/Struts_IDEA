package org.app.dao;

import org.domain.entity.Movie;
import org.domain.utils.HibernateUtil;

/**
 * Created by wangl on 2017/1/10.
 */
public class MovieDao {

    public void save(Movie movie){
        HibernateUtil.getEntityManager();
    }
}
