package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {

    // findAllByUserAndNameIn(): 여러개를 한 번에 조건으로 넘기려면 In을 붙여야함
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    // 쿼리문: select * from folder where user_id = ? and name in (?,?,?);

    List<Folder> findAllByUser(User user);

}
