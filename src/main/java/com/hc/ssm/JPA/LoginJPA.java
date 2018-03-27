package com.hc.ssm.JPA;

import com.hc.ssm.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/27.
 */
public interface LoginJPA extends JpaRepository<LoginEntity, Long>, JpaSpecificationExecutor<LoginEntity>, Serializable {
}
