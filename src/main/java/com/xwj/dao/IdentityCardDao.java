package com.xwj.dao;

import com.xwj.entity.IdentityCard;

public interface IdentityCardDao {
    IdentityCard getCardByStudentId(int studentId);
}
