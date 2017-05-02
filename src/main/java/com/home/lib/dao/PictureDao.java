package com.home.lib.dao;

import com.home.lib.domains.Picture;
import org.springframework.data.repository.CrudRepository;

public interface PictureDao extends CrudRepository<Picture, Long> {
}
