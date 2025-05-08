package com.project.etudiants;

import java.sql.Connection;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import com.project.config.DBConnectionManager;

import siggeac.jooq.generated.tables.Etudiants;
import siggeac.jooq.generated.tables.records.EtudiantsRecord;

public class EtudiantDAO {
    public List<EtudiantsRecord> findAll() throws Exception {

        try (Connection conn = DBConnectionManager.getConnection()) {
            DSLContext ctx = DSL.using(conn);
            return ctx.selectFrom(Etudiants.ETUDIANTS).fetch();
        }
    }
}
